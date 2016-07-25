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
public class MstUser extends AbstractService implements MstUserNames {


    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long id;

    /** userIdプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String userId;

    /** userPasswordプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String userPassword;

    /** delFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean delFlg;

    /** trnFavoriteList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstUser")
    public List<TrnFavorite> trnFavoriteList;

    /** trnViewHistoryList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstUser")
    public List<TrnViewHistory> trnViewHistoryList;
}