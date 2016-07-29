package xyz.skycat.work.dbrecordgentool.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractEntity;

/**
 * @author Shotaro.S
 *
 */
public class VariousTypeTable extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String CLM_INT_PK = "CLM_INT_PK";
    public static final String CLM_VARCHAR_NN = "CLM_VARCHAR_NN";
    public static final String CLM_DECIMAL_32 = "CLM_DECIMAL_32";
    public static final String CLM_DATETIME = "CLM_DATETIME";
    public static final String CLM_BLOB = "CLM_BLOB";
    public static final String CLM_BINARY = "CLM_BINARY";
    public static final String CLM_LONGBLOB = "CLM_LONGBLOB";
    public static final String CLM_MEDIUMBLOB = "CLM_MEDIUMBLOB";
    public static final String CLM_TINYBLOB = "CLM_TINYBLOB";
    public static final String CLM_VARBINARY = "CLM_VARBINARY";
    public static final String CLM_DATE = "CLM_DATE";
    public static final String CLM_DATETIME_6 = "CLM_DATETIME_6";
    public static final String CLM_TIME = "CLM_TIME";
    public static final String CLM_YEAR = "CLM_YEAR";
    public static final String CLM_GEOMETRY = "CLM_GEOMETRY";
    public static final String CLM_GEOMETRYCOLLECTION = "CLM_GEOMETRYCOLLECTION";
    public static final String CLM_LINESTRING = "CLM_LINESTRING";
    public static final String CLM_MULTILINESTRING = "CLM_MULTILINESTRING";
    public static final String CLM_MULTIPOINT = "CLM_MULTIPOINT";
    public static final String CLM_MULTIPOLYGON = "CLM_MULTIPOLYGON";
    public static final String CLM_POINT = "CLM_POINT";
    public static final String CLM_POLYGON = "CLM_POLYGON";
    public static final String CLM_BIGINT = "CLM_BIGINT";
    public static final String CLM_DECIMAL = "CLM_DECIMAL";
    public static final String CLM_DOUBLE = "CLM_DOUBLE";
    public static final String CLM_FLOAT = "CLM_FLOAT";
    public static final String CLM_INT_16 = "CLM_INT_16";
    public static final String CLM_MEDIUMINT = "CLM_MEDIUMINT";
    public static final String CLM_REAL = "CLM_REAL";
    public static final String CLM_SMALLINT_UQ = "CLM_SMALLINT_UQ";
    public static final String CLM_TINYINT_AI = "CLM_TINYINT_AI";
    public static final String CLM_CHAR = "CLM_CHAR";
    public static final String CLM_JSON = "CLM_JSON";
    public static final String CLM_NVARCHAR = "CLM_NVARCHAR";
    public static final String CLM_LONGTEXT = "CLM_LONGTEXT";
    public static final String CLM_MEDIUMTEXT = "CLM_MEDIUMTEXT";
    public static final String CLM_TEXT = "CLM_TEXT";
    public static final String CLM_TINYTEXT = "CLM_TINYTEXT";
    public static final String CLM_BIT = "CLM_BIT";
    public static final String CLM_ENUM = "CLM_ENUM";
    public static final String CLM_SET = "CLM_SET";
    public static final String CLM_INT_ZF = "CLM_INT_ZF";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public int clmIntPk;
    public String clmVarcharNn = "";
    public java.math.BigDecimal clmDecimal32 = new java.math.BigDecimal(0);
    public java.util.Date clmDatetime = java.util.Calendar.getInstance().getTime();
    public java.util.List<Byte> clmBlob = new java.util.ArrayList<Byte>();
    public java.util.List<Byte> clmBinary = new java.util.ArrayList<Byte>();
    public java.util.List<Byte> clmLongblob = new java.util.ArrayList<Byte>();
    public java.util.List<Byte> clmMediumblob = new java.util.ArrayList<Byte>();
    public java.util.List<Byte> clmTinyblob = new java.util.ArrayList<Byte>();
    public java.util.List<Byte> clmVarbinary = new java.util.ArrayList<Byte>();
    public java.util.Date clmDate = java.util.Calendar.getInstance().getTime();
    public java.util.Date clmDatetime6 = java.util.Calendar.getInstance().getTime();
    public java.util.Date clmTime = java.util.Calendar.getInstance().getTime();
    public java.util.Date clmYear = java.util.Calendar.getInstance().getTime();
    public java.util.List<Byte> clmGeometry = new java.util.ArrayList<Byte>();
    public String clmGeometrycollection = "";
    public String clmLinestring = "";
    public String clmMultilinestring = "";
    public String clmMultipoint = "";
    public String clmMultipolygon = "";
    public String clmPoint = "";
    public String clmPolygon = "";
    public long clmBigint;
    public java.math.BigDecimal clmDecimal = new java.math.BigDecimal(0);
    public double clmDouble;
    public float clmFloat;
    public int clmInt16;
    public int clmMediumint;
    public double clmReal;
    public short clmSmallintUq;
    public byte clmTinyintAi;
    public String clmChar = "";
    public String clmJson = "";
    public String clmNvarchar = "";
    public String clmLongtext = "";
    public String clmMediumtext = "";
    public String clmText = "";
    public String clmTinytext = "";
    public java.util.List<Byte> clmBit = new java.util.ArrayList<Byte>();
    public String clmEnum = "";
    public String clmSet = "";
    public long clmIntZf;
    public String insModuleId = "";

    public VariousTypeTable(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "VARIOUS_TYPE_TABLE";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("CLM_INT_PK", clmIntPk);
        map.put("CLM_VARCHAR_NN", clmVarcharNn);
        map.put("CLM_DECIMAL_32", clmDecimal32);
        map.put("CLM_DATETIME", clmDatetime);
        map.put("CLM_BLOB", clmBlob);
        map.put("CLM_BINARY", clmBinary);
        map.put("CLM_LONGBLOB", clmLongblob);
        map.put("CLM_MEDIUMBLOB", clmMediumblob);
        map.put("CLM_TINYBLOB", clmTinyblob);
        map.put("CLM_VARBINARY", clmVarbinary);
        map.put("CLM_DATE", clmDate);
        map.put("CLM_DATETIME_6", clmDatetime6);
        map.put("CLM_TIME", clmTime);
        map.put("CLM_YEAR", clmYear);
        map.put("CLM_GEOMETRY", clmGeometry);
        map.put("CLM_GEOMETRYCOLLECTION", clmGeometrycollection);
        map.put("CLM_LINESTRING", clmLinestring);
        map.put("CLM_MULTILINESTRING", clmMultilinestring);
        map.put("CLM_MULTIPOINT", clmMultipoint);
        map.put("CLM_MULTIPOLYGON", clmMultipolygon);
        map.put("CLM_POINT", clmPoint);
        map.put("CLM_POLYGON", clmPolygon);
        map.put("CLM_BIGINT", clmBigint);
        map.put("CLM_DECIMAL", clmDecimal);
        map.put("CLM_DOUBLE", clmDouble);
        map.put("CLM_FLOAT", clmFloat);
        map.put("CLM_INT_16", clmInt16);
        map.put("CLM_MEDIUMINT", clmMediumint);
        map.put("CLM_REAL", clmReal);
        map.put("CLM_SMALLINT_UQ", clmSmallintUq);
        map.put("CLM_TINYINT_AI", clmTinyintAi);
        map.put("CLM_CHAR", clmChar);
        map.put("CLM_JSON", clmJson);
        map.put("CLM_NVARCHAR", clmNvarchar);
        map.put("CLM_LONGTEXT", clmLongtext);
        map.put("CLM_MEDIUMTEXT", clmMediumtext);
        map.put("CLM_TEXT", clmText);
        map.put("CLM_TINYTEXT", clmTinytext);
        map.put("CLM_BIT", clmBit);
        map.put("CLM_ENUM", clmEnum);
        map.put("CLM_SET", clmSet);
        map.put("CLM_INT_ZF", clmIntZf);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
