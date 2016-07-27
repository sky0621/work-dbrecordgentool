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
public class RelRecommendMovie extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String mst_movie_movie_id = "mst_movie_movie_id".toUpperCase();
    public static final String mst_recommend_recommend_id = "mst_recommend_recommend_id".toUpperCase();

    /*
     * Default Value
     */
    public long _mstMovieMovieId;
    public long _mstRecommendRecommendId;

    public RelRecommendMovie(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "rel_recommend_movie";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mst_movie_movie_id".toUpperCase(), _mstMovieMovieId);
        map.put("mst_recommend_recommend_id".toUpperCase(), _mstRecommendRecommendId);
        return map;
    }

}
