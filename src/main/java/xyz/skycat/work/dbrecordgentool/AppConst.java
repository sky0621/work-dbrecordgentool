package xyz.skycat.work.dbrecordgentool;

/**
 * @author Shotaro.S
 *
 */
public class AppConst {

	public static final String USER_DIR = System.getProperty("user.dir");

	public static final String RESOURCES = USER_DIR + "/src/main/resources/";

	public static final String TARGET_TABLES = RESOURCES
			+ "config/targettables.txt";

	public static final String INSERT_DATA = RESOURCES + "insertdata/data.xls";

	public static final String ENTITY_PACKAGE = "xyz.skycat.work.dbrecordgentool.entity.";

	public static final String JDBC_DICON = RESOURCES + "jdbc.dicon";

}
