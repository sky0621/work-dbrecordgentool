package xyz.skycat.work.dbrecordgentool;

import static xyz.skycat.work.dbrecordgentool.AppConst.*;

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
import xyz.skycat.work.dbrecordgentool.util.JdbcDiconUtil;

public class Main {

	// Oracleの場合、統計情報へのロック解除でテーブルクラス作成可

	// 対象テーブルの統計情報にロックがかかっていると、前段のS2JDBC-GENを用いたテーブルクラス自動生成が失敗する。
	// 【ORA-38029: オブジェクト統計はロックされています】
	// exec DBMS_STATS.UNLOCK_TABLE_STATS('owner','table
	// name');　でロック解除。※全テーブル分・・・。
	// ロックされているかどうかは、select table_name, stattype_locked from dba_tab_statistics
	// where owner = 'owner';　でわかる。
	// ALL だとロックされてる。

	public static void main(String[] args) {
		try {
			checkArgs(args);
			Parameter p = JdbcDiconUtil.parse();
			p.sysColumnValue = args[0];

			BufferedReader br = null;
			InputStream inExcel = null;
			Workbook wb = null;
			try {
				FileInputStream is = new FileInputStream(TARGET_TABLES);

				InputStreamReader in = new InputStreamReader(is, "SJIS");
				br = new BufferedReader(in);

				String s = null;
				Class<? extends AbstractEntity> clz = null;
				Constructor<? extends AbstractEntity> constructor = null;

				inExcel = new FileInputStream(INSERT_DATA);
				wb = WorkbookFactory.create(inExcel);

				while ((s = br.readLine()) != null) {
					// System.out.println(s);
					clz = Class.forName(ENTITY_PACKAGE + s).asSubclass(
							AbstractEntity.class);
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

	private static void checkArgs(String[] args) {

		if (args == null || args.length != 1) {
			throw new IllegalArgumentException(
					"引数は「INS_MODULE_IDカラムにセットする識別子」１つ固定です。");
		}
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
