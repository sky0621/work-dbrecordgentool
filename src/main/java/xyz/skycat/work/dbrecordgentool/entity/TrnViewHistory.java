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
public class TrnViewHistory extends AbstractService implements TrnViewHistoryNames {


    /** mstMovieMovieIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstMovieMovieId;

    /** mstUserIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstUserId;

    /** mstUser関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_user_id", referencedColumnName = "id")
    public MstUser mstUser;

    /** mstMovie関連プロパティRERERERE */
    @ManyToOne
    @JoinColumn(name = "mst_movie_movie_id", referencedColumnName = "movie_id")
    public MstMovie mstMovie;
}