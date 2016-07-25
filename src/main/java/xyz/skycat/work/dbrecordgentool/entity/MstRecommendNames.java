package xyz.skycat.work.dbrecordgentool.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import xyz.skycat.work.dbrecordgentool.entity.RelRecommendMovieNames._RelRecommendMovieNames;

/**
 * {@link MstRecommend}のプロパティ名の集合です。YO
 *
 */gaagagaga
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/26 0:00:03")
public class MstRecommendNames {

    /**
     * recommendIdのプロパティ名を返します。
     *
     * @return recommendIdのプロパティ名
     */
    public static PropertyName<Long> recommendId() {
        return new PropertyName<Long>("recommendId");
    }

    /**
     * recommendTitleのプロパティ名を返します。
     *
     * @return recommendTitleのプロパティ名
     */
    public static PropertyName<String> recommendTitle() {
        return new PropertyName<String>("recommendTitle");
    }

    /**
     * relRecommendMovieListのプロパティ名を返します。
     *
     * @return relRecommendMovieListのプロパティ名
     */
    public static _RelRecommendMovieNames relRecommendMovieList() {
        return new _RelRecommendMovieNames("relRecommendMovieList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstRecommendNames extends PropertyName<MstRecommend> {

        /**
         * インスタンスを構築します。
         */
        public _MstRecommendNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _MstRecommendNames(final String name) {
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
        public _MstRecommendNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * recommendIdのプロパティ名を返します。
         *
         * @return recommendIdのプロパティ名
         */
        public PropertyName<Long> recommendId() {
            return new PropertyName<Long>(this, "recommendId");
        }

        /**
         * recommendTitleのプロパティ名を返します。
         *
         * @return recommendTitleのプロパティ名
         */
        public PropertyName<String> recommendTitle() {
            return new PropertyName<String>(this, "recommendTitle");
        }

        /**
         * relRecommendMovieListのプロパティ名を返します。
         *
         * @return relRecommendMovieListのプロパティ名
         */
        public _RelRecommendMovieNames relRecommendMovieList() {
            return new _RelRecommendMovieNames(this, "relRecommendMovieList");
        }
    }
}