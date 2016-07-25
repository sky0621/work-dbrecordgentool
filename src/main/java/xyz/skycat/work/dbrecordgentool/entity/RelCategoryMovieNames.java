package xyz.skycat.work.dbrecordgentool.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import xyz.skycat.work.dbrecordgentool.entity.MstCategoryNames._MstCategoryNames;
import xyz.skycat.work.dbrecordgentool.entity.MstMovieNames._MstMovieNames;

/**
 * {@link RelCategoryMovie}のプロパティ名の集合です。YO
 *
 */gaagagaga
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/26 0:00:03")
public class RelCategoryMovieNames {

    /**
     * mstMovieMovieIdのプロパティ名を返します。
     *
     * @return mstMovieMovieIdのプロパティ名
     */
    public static PropertyName<Long> mstMovieMovieId() {
        return new PropertyName<Long>("mstMovieMovieId");
    }

    /**
     * mstCategoryCategoryIdのプロパティ名を返します。
     *
     * @return mstCategoryCategoryIdのプロパティ名
     */
    public static PropertyName<Long> mstCategoryCategoryId() {
        return new PropertyName<Long>("mstCategoryCategoryId");
    }

    /**
     * mstCategoryのプロパティ名を返します。
     *
     * @return mstCategoryのプロパティ名
     */
    public static _MstCategoryNames mstCategory() {
        return new _MstCategoryNames("mstCategory");
    }

    /**
     * mstMovieのプロパティ名を返します。
     *
     * @return mstMovieのプロパティ名
     */
    public static _MstMovieNames mstMovie() {
        return new _MstMovieNames("mstMovie");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _RelCategoryMovieNames extends PropertyName<RelCategoryMovie> {

        /**
         * インスタンスを構築します。
         */
        public _RelCategoryMovieNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _RelCategoryMovieNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         *
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _RelCategoryMovieNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * mstMovieMovieIdのプロパティ名を返します。
         *
         * @return mstMovieMovieIdのプロパティ名
         */
        public PropertyName<Long> mstMovieMovieId() {
            return new PropertyName<Long>(this, "mstMovieMovieId");
        }

        /**
         * mstCategoryCategoryIdのプロパティ名を返します。
         *
         * @return mstCategoryCategoryIdのプロパティ名
         */
        public PropertyName<Long> mstCategoryCategoryId() {
            return new PropertyName<Long>(this, "mstCategoryCategoryId");
        }

        /**
         * mstCategoryのプロパティ名を返します。
         *
         * @return mstCategoryのプロパティ名
         */
        public _MstCategoryNames mstCategory() {
            return new _MstCategoryNames(this, "mstCategory");
        }

        /**
         * mstMovieのプロパティ名を返します。
         *
         * @return mstMovieのプロパティ名
         */
        public _MstMovieNames mstMovie() {
            return new _MstMovieNames(this, "mstMovie");
        }
    }
}