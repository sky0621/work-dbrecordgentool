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
    public static final String ${attr.columnName} = "${attr.columnName}";
</#list>

    /*
     * Default Value
     */
<#list attributeModelList as attr>
  <#if (str!attr.attributeClass.simpleName) == "Date">
    public java.util.${attr.attributeClass.simpleName} _${attr.name};
  <#else>
    public ${attr.attributeClass.simpleName} _${attr.name};
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
        map.put("${attr.columnName}", _${attr.name});
</#list>
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

}
