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
    public static final String category_id = "category_id".toUpperCase();
    public static final String category_name = "category_name".toUpperCase();

    /*
     * Default Value
     */
    public long _categoryId;
    public String _categoryName = "";

    public MstCategory(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "mst_category";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("category_id".toUpperCase(), _categoryId);
        map.put("category_name".toUpperCase(), _categoryName);
        return map;
    }

}
