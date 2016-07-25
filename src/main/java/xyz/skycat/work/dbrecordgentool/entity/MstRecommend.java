package xyz.skycat.work.dbrecordgentool.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractService;

/**
 * @author Shotaro.S
 *
 */
public class MstRecommend extends AbstractService implements MstRecommendNames {


    /** recommendIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long recommendId;

    /** recommendTitleプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String recommendTitle;

    /** relRecommendMovieList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstRecommend")
    public List<RelRecommendMovie> relRecommendMovieList;
}