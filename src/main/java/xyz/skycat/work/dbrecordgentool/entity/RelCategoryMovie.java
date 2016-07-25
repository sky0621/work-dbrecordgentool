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
public class RelCategoryMovie extends AbstractService implements RelCategoryMovieNames {


    /** mstMovieMovieIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstMovieMovieId;

    /** mstCategoryCategoryIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstCategoryCategoryId;

    /** mstCategory関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_category_category_id", referencedColumnName = "category_id")
    public MstCategory mstCategory;

    /** mstMovie関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_movie_movie_id", referencedColumnName = "movie_id")
    public MstMovie mstMovie;
}