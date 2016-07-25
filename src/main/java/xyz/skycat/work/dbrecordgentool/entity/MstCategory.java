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

/**
 * MstCategoryエンティティクラスTWEWEWsEW
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/25 23:59:59")
public class MstCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /** categoryIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long categoryId;

    /** categoryNameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String categoryName;

    /** relCategoryMovieList関連プロパティRERERERE */
    @OneToMany(mappedBy = "mstCategory")
    public List<RelCategoryMovie> relCategoryMovieList;
}