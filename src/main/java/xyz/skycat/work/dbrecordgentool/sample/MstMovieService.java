package xyz.skycat.work.dbrecordgentool.sample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractService;

public class MstMovieService extends AbstractService {

    /*
     * Column Name
     */
    public static final String MOVIE_ID = "MOVIE_ID";
    public static final String MOVIE_TITLE = "MOVIE_TITLE";
    public static final String MOVIE_FILENAME = "MOVIE_FILENAME";
    public static final String MOVIE_TIME = "MOVIE_TIME";
    public static final String MOVIE_TAKE_DATE = "MOVIE_TAKE_DATE";
    public static final String DEL_FLG = "DEL_FLG";
    public static final String INS_ID = "INS_ID";

    /*
     * Default Value
     */
    public Long movieId;
    public String movieTitle = "";
    public String movieFilename = "";
    public String movieTime = "";
    public Date movieTakeDate = Calendar.getInstance().getTime();
    public Boolean delFlg = false;

    private List<Map<String, Object>> columnsList;

    public MstMovieService(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "mst_movie";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(MOVIE_TITLE, movieTitle);
        map.put(MOVIE_FILENAME, movieFilename);
        map.put(MOVIE_TIME, movieTime);
        map.put(MOVIE_TAKE_DATE, movieTakeDate);
        map.put(DEL_FLG, delFlg);
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

    @Override
    public void setColumnsList(List<Map<String, Object>> columnsList) {
        this.columnsList = columnsList;
    }

    @Override
    public List<Map<String, Object>> getColumnsList() {
        if (columnsList == null) {
            columnsList = new ArrayList<Map<String, Object>>();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put(MOVIE_ID, 777);
            columnsList.add(map);
        }
        return columnsList;
    }

}
