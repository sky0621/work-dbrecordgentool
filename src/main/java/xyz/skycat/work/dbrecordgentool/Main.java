package xyz.skycat.work.dbrecordgentool;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import xyz.skycat.work.dbrecordgentool.base.AbstractEntity;

public class Main {

	public static void main(String[] args) {
		try {
			Parameter p = new Parameter(args);
			BufferedReader br = null;
			InputStream inExcel = null;
			Workbook wb = null;
			try {
				String basepath = System.getProperty("user.dir");
				FileInputStream is = new FileInputStream(basepath
						+ "/src/main/resources/config/targettables.txt");

				InputStreamReader in = new InputStreamReader(is, "SJIS");
				br = new BufferedReader(in);

				String s = null;
				Class<? extends AbstractEntity> clz = null;
				Constructor<? extends AbstractEntity> constructor = null;

				inExcel = new FileInputStream(basepath
						+ "/src/main/resources/insertdata/data.xls");
				wb = WorkbookFactory.create(inExcel);

				while ((s = br.readLine()) != null) {
					// System.out.println(s);
					clz = Class.forName(
							"xyz.skycat.work.dbrecordgentool.entity." + s)
							.asSubclass(AbstractEntity.class);
					constructor = clz.getConstructor(Parameter.class);
					AbstractEntity entity = constructor.newInstance(p);

					List<Map<String, Object>> columnsList = new ArrayList<Map<String, Object>>();

					for (Sheet sheet : wb) {
						if (sheet.getSheetName().equals(s)) {
							int rowCnt = 0;
							List<String> keyList = new ArrayList<String>();
							// 行ごと・・・
							for (Row row : sheet) {
								// １行目はラベル行
								if (rowCnt == 0) {
									for (Cell cell : row) {
										String label = (String) getCellValue(cell);
										keyList.add(label);
									}
									rowCnt++;
									continue;
								}
								// カラムごと・・・
								int index = 0;
								Map<String, Object> m = new HashMap<String, Object>();
								for (Cell cell : row) {
									String key = keyList.get(index);
									Object val = getCellValue(cell);
									if (key != null) {
										m.put(key.toUpperCase(), val);
									}
									index++;
								}
								if (!m.isEmpty()) {
									columnsList.add(m);
								}
								rowCnt++;
							}
						}
					}

					entity.setColumnsList(columnsList);
					entity.operation();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (wb != null) {
					wb.close();
				}
				if (inExcel != null) {
					inExcel.close();
				}
				br.close();
			}
		} catch (Throwable t) {
			t.printStackTrace();
			System.exit(1);
		}
		System.exit(0);
	}

	private static Object getCellValue(Cell cell) {
		switch (cell.getCellType()) {

		case Cell.CELL_TYPE_STRING:
			return cell.getRichStringCellValue().getString();

		case Cell.CELL_TYPE_NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue();
			} else {
				return cell.getNumericCellValue();
			}

		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();

		case Cell.CELL_TYPE_FORMULA:
			return cell.getCellFormula();

		default:
			return null;

		}

	}

}
