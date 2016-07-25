package xyz.skycat.work.dbrecordgentool.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import xyz.skycat.work.dbrecordgentool.Parameter;
import xyz.skycat.work.dbrecordgentool.base.AbstractService;

/**
 * @author Shotaro.S
 *
 */
public class RelRecommendMovie extends AbstractService implements RelRecommendMovieNames {


    /** mstMovieMovieIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstMovieMovieId;

    /** mstRecommendRecommendIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstRecommendRecommendId;

    /** mstRecommend関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_recommend_recommend_id", referencedColumnName = "recommend_id")
    public MstRecommend mstRecommend;

    /** mstMovie関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_movie_movie_id", referencedColumnName = "movie_id")
    public MstMovie mstMovie;
}