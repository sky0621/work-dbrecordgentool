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
    public static final String recommend_id = "recommend_id";
    public static final String recommend_title = "recommend_title";

    /*
     * Default Value
     */
    public Long _recommendId;
    public String _recommendTitle;

    public MstRecommend(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "mst_recommend";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("recommend_id", _recommendId);
        map.put("recommend_title", _recommendTitle);
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

}
