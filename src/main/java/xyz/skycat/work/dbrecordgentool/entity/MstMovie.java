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
    public static final String movie_id = "movie_id".toUpperCase();
    public static final String movie_title = "movie_title".toUpperCase();
    public static final String movie_filename = "movie_filename".toUpperCase();
    public static final String movie_time = "movie_time".toUpperCase();
    public static final String movie_take_date = "movie_take_date".toUpperCase();
    public static final String del_flg = "del_flg".toUpperCase();
    public static final String ins_id = "ins_id".toUpperCase();

    /*
     * Default Value
     */
    public long _movieId;
    public String _movieTitle = "";
    public String _movieFilename = "";
    public String _movieTime = "";
    public java.util.Date _movieTakeDate = java.util.Calendar.getInstance().getTime();
    public boolean _delFlg;
    public String _insId = "";

    public MstMovie(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "mst_movie";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("movie_id".toUpperCase(), _movieId);
        map.put("movie_title".toUpperCase(), _movieTitle);
        map.put("movie_filename".toUpperCase(), _movieFilename);
        map.put("movie_time".toUpperCase(), _movieTime);
        map.put("movie_take_date".toUpperCase(), _movieTakeDate);
        map.put("del_flg".toUpperCase(), _delFlg);
        map.put("INS_ID", p.sysColumnValue);
        return map;
    }

}
