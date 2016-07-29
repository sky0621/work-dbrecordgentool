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
public class TrnViewHistory extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String MST_MOVIE_MOVIE_ID = "MST_MOVIE_MOVIE_ID";
    public static final String MST_USER_ID = "MST_USER_ID";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public long mstMovieMovieId;
    public long mstUserId;
    public String insModuleId = "";

    public TrnViewHistory(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "TRN_VIEW_HISTORY";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("MST_MOVIE_MOVIE_ID", mstMovieMovieId);
        map.put("MST_USER_ID", mstUserId);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
