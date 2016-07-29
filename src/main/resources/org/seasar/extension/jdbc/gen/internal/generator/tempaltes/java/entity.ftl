<#if packageName??>
package ${packageName};
</#if>

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractEntity;

/**
 * @author Shotaro.S
 *
 */
public class ${shortClassName} extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
<#list attributeModelList as attr>
    public static final String ${attr.columnName?upper_case} = "${attr.columnName?upper_case}";
</#list>

    /*
     * Default Value
     */
<#list attributeModelList as attr>
  <#if (str!attr.attributeClass.simpleName) == "Date" || (str!attr.attributeClass.simpleName) == "Timestamp" || (str!attr.attributeClass.simpleName) == "Time">
    public java.util.Date ${attr.name} = java.util.Calendar.getInstance().getTime();
  <#elseif (str!attr.attributeClass.simpleName) == "Long">
    public long ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Integer">
    public int ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Boolean">
    public boolean ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "BigDecimal">
    public java.math.BigDecimal ${attr.name} = new java.math.BigDecimal(0);
  <#elseif (str!attr.attributeClass.simpleName) == "byte[]">
    public java.util.List<Byte> ${attr.name} = new java.util.ArrayList<Byte>();
  <#elseif (str!attr.attributeClass.simpleName) == "byte">
    public byte ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Double">
    public double ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Float">
    public float ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Short">
    public short ${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Byte">
    public byte ${attr.name};
  <#else>
    public ${attr.attributeClass.simpleName} ${attr.name} = "";
  </#if>
</#list>

    public ${shortClassName}(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "${tableName?upper_case}";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
<#list attributeModelList as attr>
  <#if (str!attr.columnName?upper_case) == "INS_MODULE_ID">
        map.put("INS_MODULE_ID", p.sysColumnValue);
  <#else>
        map.put("${attr.columnName?upper_case}", ${attr.name});
  </#if>
</#list>
        return map;
    }

}
