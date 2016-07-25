package xyz.skycat.work.dbrecordgentool.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * MstMovieエンティティクラスTWEWEWsEW
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/25 23:59:59")
public class MstMovie implements Serializable {

    private static final long serialVersionUID = 1L;

    /** movieIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long movieId;

    /** movieTitleプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String movieTitle;

    /** movieFilenameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String movieFilename;

    /** movieTimeプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String movieTime;

    /** movieTakeDateプロパティ */
    @Column(nullable = false, unique = false)
    public Date movieTakeDate;

    /** delFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean delFlg;

    /** insIdプロパティ */
    @Column(length = 45, nullable = false, unique = false)
    public String insId;

    /** relCategoryMovieList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstMovie")
    public List<RelCategoryMovie> relCategoryMovieList;

    /** relRecommendMovieList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstMovie")
    public List<RelRecommendMovie> relRecommendMovieList;

    /** trnFavoriteList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstMovie")
    public List<TrnFavorite> trnFavoriteList;

    /** trnViewHistoryList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstMovie")
    public List<TrnViewHistory> trnViewHistoryList;
}