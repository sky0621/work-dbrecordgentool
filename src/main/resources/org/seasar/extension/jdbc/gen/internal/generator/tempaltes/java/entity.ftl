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
    public static final String ${attr.columnName} = "${attr.columnName}".toUpperCase();
</#list>

    /*
     * Default Value
     */
<#list attributeModelList as attr>
  <#if (str!attr.attributeClass.simpleName) == "Date">
    public java.util.${attr.attributeClass.simpleName} _${attr.name} = java.util.Calendar.getInstance().getTime();
  <#elseif (str!attr.attributeClass.simpleName) == "Long">
    public long _${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Integer">
    public int _${attr.name};
  <#elseif (str!attr.attributeClass.simpleName) == "Boolean">
    public boolean _${attr.name};
  <#else>
    public ${attr.attributeClass.simpleName} _${attr.name} = "";
  </#if>
</#list>

    public ${shortClassName}(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "${tableName}";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
<#list attributeModelList as attr>
  <#if (str!attr.columnName) == "INS_ID">
        map.put("INS_ID", p.sysColumnValue);
  <#elseif (str!attr.columnName) == "ins_id">
        map.put("INS_ID", p.sysColumnValue);
  <#else>
        map.put("${attr.columnName}".toUpperCase(), _${attr.name});
  </#if>
</#list>
        return map;
    }

}
