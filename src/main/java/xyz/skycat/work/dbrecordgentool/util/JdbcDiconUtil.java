/**
 *
 */
package xyz.skycat.work.dbrecordgentool.util;

import static xyz.skycat.work.dbrecordgentool.AppConst.*;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import xyz.skycat.work.dbrecordgentool.Parameter;

/**
 * @author Shotaro.S
 *
 */
public class JdbcDiconUtil {

	public static Parameter parse() {
		Parameter param = new Parameter();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbFactory.newDocumentBuilder();
			Document doc = db.parse(JDBC_DICON);
			Element root = doc.getDocumentElement();
			NodeList children = root.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				Node child = children.item(i);
				if (Node.ELEMENT_NODE != child.getNodeType()) {
					continue;
				}
				if (!"component".equals(child.getNodeName())) {
					continue;
				}
				NamedNodeMap attrMap = child.getAttributes();
				if (attrMap == null) {
					continue;
				}
				Node nameNode = attrMap.getNamedItem("name");
				if (nameNode == null) {
					continue;
				}
				if (!"xaDataSource".equals(nameNode.getNodeValue())) {
					continue;
				}
				NodeList propertyList = child.getChildNodes();
				for (int j = 0; j < propertyList.getLength(); j++) {
					Node propertyNode = propertyList.item(j);
					if (propertyNode == null) {
						continue;
					}
					NamedNodeMap attrMap2 = propertyNode.getAttributes();
					if (attrMap2 == null) {
						continue;
					}
					Node urlNode = attrMap2.getNamedItem("URL");
					if (urlNode != null) {
						param.dbUrl = urlNode.getNodeValue();
					}
					Node userNode = attrMap2.getNamedItem("user");
					if (userNode != null) {
						param.dbUser = userNode.getNodeValue();
					}
					Node passwordNode = attrMap2.getNamedItem("password");
					if (passwordNode != null) {
						param.dbPassword = passwordNode.getNodeValue();
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return param;
	}

}
