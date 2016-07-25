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
public class RelCategoryMovie extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /*
     * Column Name
     */
    public static final String mst_movie_movie_id = "mst_movie_movie_id";
    public static final String mst_category_category_id = "mst_category_category_id";

    /*
     * Default Value
     */
    public Long _mstMovieMovieId;
    public Long _mstCategoryCategoryId;

    public RelCategoryMovie(Parameter p) {
        super(p);
    }

    @Override
    public String getTableName() {
        return "rel_category_movie";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mst_movie_movie_id", _mstMovieMovieId);
        map.put("mst_category_category_id", _mstCategoryCategoryId);
        map.put(p.sysColumnName, p.sysColumnValue);
        return map;
    }

}
