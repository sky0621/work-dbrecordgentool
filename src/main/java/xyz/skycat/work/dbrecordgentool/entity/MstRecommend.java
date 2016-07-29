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
public class MstRecommend extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String RECOMMEND_ID = "RECOMMEND_ID";
    public static final String RECOMMEND_TITLE = "RECOMMEND_TITLE";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public long recommendId;
    public String recommendTitle = "";
    public String insModuleId = "";

    public MstRecommend(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "MST_RECOMMEND";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("RECOMMEND_ID", recommendId);
        map.put("RECOMMEND_TITLE", recommendTitle);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
