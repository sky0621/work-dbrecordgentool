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
public class MstMovie extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String MOVIE_ID = "MOVIE_ID";
    public static final String MOVIE_TITLE = "MOVIE_TITLE";
    public static final String MOVIE_FILENAME = "MOVIE_FILENAME";
    public static final String MOVIE_TIME = "MOVIE_TIME";
    public static final String MOVIE_TAKE_DATE = "MOVIE_TAKE_DATE";
    public static final String DEL_FLG = "DEL_FLG";
    public static final String INS_MODULE_ID = "INS_MODULE_ID";

    /*
     * Default Value
     */
    public long movieId;
    public String movieTitle = "";
    public String movieFilename = "";
    public String movieTime = "";
    public java.util.Date movieTakeDate = java.util.Calendar.getInstance().getTime();
    public boolean delFlg;
    public String insModuleId = "";

    public MstMovie(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "MST_MOVIE";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("MOVIE_ID", movieId);
        map.put("MOVIE_TITLE", movieTitle);
        map.put("MOVIE_FILENAME", movieFilename);
        map.put("MOVIE_TIME", movieTime);
        map.put("MOVIE_TAKE_DATE", movieTakeDate);
        map.put("DEL_FLG", delFlg);
        map.put("INS_MODULE_ID", p.sysColumnValue);
        return map;
    }

}
