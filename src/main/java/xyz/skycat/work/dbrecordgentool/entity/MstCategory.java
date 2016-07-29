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
public class MstCategory extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String CATEGORY_ID = "CATEGORY_ID";
    public static final String CATEGORY_NAME = "CATEGORY_NAME";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public long categoryId;
    public String categoryName = "";
    public String insModuleId = "";

    public MstCategory(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "MST_CATEGORY";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("CATEGORY_ID", categoryId);
        map.put("CATEGORY_NAME", categoryName);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
