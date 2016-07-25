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
    public static final String movie_id = "movie_id";
    public static final String movie_title = "movie_title";
    public static final String movie_filename = "movie_filename";
    public static final String movie_time = "movie_time";
    public static final String movie_take_date = "movie_take_date";
    public static final String del_flg = "del_flg";
    public static final String ins_id = "ins_id";

    /*
     * Default Value
     */
    public Long _movieId;
    public String _movieTitle;
    public String _movieFilename;
    public String _movieTime;
    public java.util.Date _movieTakeDate;
    public Boolean _delFlg;
    public String _insId;

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
        map.put("movie_id", _movieId);
        map.put("movie_title", _movieTitle);
        map.put("movie_filename", _movieFilename);
        map.put("movie_time", _movieTime);
        map.put("movie_take_date", _movieTakeDate);
        map.put("del_flg", _delFlg);
        map.put("ins_id", _insId);
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

}
