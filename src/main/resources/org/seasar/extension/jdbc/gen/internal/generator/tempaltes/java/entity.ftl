<#if packageName??>
package ${packageName};
</#if>

<#list importNameSet as importName>
import ${importName};
</#list>

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractService;
<#if staticImportNameSet?size gt 0>

  <#list staticImportNameSet as importName>
import static ${importName};
  </#list>
</#if>

/**
 * @author Shotaro.S
 *
 */
public class ${shortClassName} extends AbstractService implements ${shortClassName}Names {
<#list attributeModelList as attr>

  <#if attr.id>
    @Id
    <#if attr.generationType??>
    @GeneratedValue(strategy = GenerationType.${attr.generationType}<#if attr.generationType?matches("SEQUENCE|TABLE")>, generator = "generator"</#if>)
      <#if attr.generationType == "SEQUENCE">
    @SequenceGenerator(name = "generator", initialValue = ${attr.initialValue}, allocationSize = ${attr.allocationSize})
      <#elseif attr.generationType == "TABLE">
    @TableGenerator(name = "generator", initialValue = ${attr.initialValue}, allocationSize = ${attr.allocationSize})
      </#if>
    </#if>
  </#if>
    <#if useAccessor>private<#else>public</#if> ${attr.attributeClass.simpleName} ${attr.name};
</#list>

<#if useAccessor>
  <#list attributeModelList as attr>

    /**
     * ${attr.name}を返します。
     *
     * @param ${attr.name}
     */
    public ${attr.attributeClass.simpleName} <#if attr.attributeClass.getSimpleName()?matches("[bB]oolean")>is<#else>get</#if>${attr.name?cap_first}() {
        return ${attr.name};
    }

    /**
     * ${attr.name}を設定します。
     *
     * @param ${attr.name}
     */
    public void set${attr.name?cap_first}(${attr.attributeClass.simpleName} ${attr.name}) {
        this.${attr.name} = ${attr.name};
    }
  </#list>
  <#list associationModelList as asso>

    /**
     * ${asso.name}を返します。
     *
     * @param ${asso.name}
     */
    public ${asso.shortClassName} get${asso.name?cap_first}() {
        return ${asso.name};
    }

    /**
     * ${asso.name}を設定します。
     *
     * @param ${asso.name}
     */
    public void set${asso.name?cap_first}(${asso.shortClassName} ${asso.name}) {
        this.${asso.name} = ${asso.name};
    }
  </#list>
</#if>
}