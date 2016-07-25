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
public class MstCategory extends AbstractService implements MstCategoryNames {


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