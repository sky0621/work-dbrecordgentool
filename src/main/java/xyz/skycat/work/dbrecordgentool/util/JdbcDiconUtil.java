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
				if (isNotDataSourceNode(children.item(i))) {
					continue;
				}
				String dbUrl = getTargetPropertyValue(children.item(i), "URL");
				if (dbUrl != null) {
					param.dbUrl = dbUrl;
				}
				String dbUser = getTargetPropertyValue(children.item(i), "user");
				if (dbUser != null) {
					param.dbUser = dbUser;
				}
				String dbPassword = getTargetPropertyValue(children.item(i),
						"password");
				if (dbPassword != null) {
					param.dbPassword = dbPassword;
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return param;
	}

	private static boolean isNotDataSourceNode(Node node) {
		if (Node.ELEMENT_NODE != node.getNodeType()) {
			return true;
		}
		if (!"component".equals(node.getNodeName())) {
			return true;
		}
		NamedNodeMap attrMap = node.getAttributes();
		if (attrMap == null) {
			return true;
		}
		Node nameNode = attrMap.getNamedItem("name");
		if (nameNode == null) {
			return true;
		}
		if (!"xaDataSource".equals(nameNode.getNodeValue())) {
			return true;
		}
		return false;
	}

	private static String getTargetPropertyValue(Node dataSourceNode,
			String name) {
		String propertyValue = null;
		NodeList propertyList = dataSourceNode.getChildNodes();
		for (int j = 0; j < propertyList.getLength(); j++) {
			Node propertyNode = propertyList.item(j);
			if (propertyNode == null) {
				continue;
			}
			NamedNodeMap attrMap = propertyNode.getAttributes();
			if (attrMap == null) {
				continue;
			}
			for (int k = 0; k < attrMap.getLength(); k++) {
				Node at = attrMap.item(k);
				if ("name".equals(at.getNodeName())
						&& name.equals(at.getNodeValue())) {
					propertyValue = propertyNode.getTextContent().replace("\"", "").replace("\n", "").replace("\t", "");
				}
			}
		}

		return propertyValue;
	}

}
