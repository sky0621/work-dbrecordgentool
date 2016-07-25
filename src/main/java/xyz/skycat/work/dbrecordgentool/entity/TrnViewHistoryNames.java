package xyz.skycat.work.dbrecordgentool.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import xyz.skycat.work.dbrecordgentool.entity.MstMovieNames._MstMovieNames;
import xyz.skycat.work.dbrecordgentool.entity.MstUserNames._MstUserNames;

/**
 * {@link TrnViewHistory}のプロパティ名の集合です。YO
 *
 */gaagagaga
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/26 0:00:03")
public class TrnViewHistoryNames {

    /**
     * mstMovieMovieIdのプロパティ名を返します。
     *
     * @return mstMovieMovieIdのプロパティ名
     */
    public static PropertyName<Long> mstMovieMovieId() {
        return new PropertyName<Long>("mstMovieMovieId");
    }

    /**
     * mstUserIdのプロパティ名を返します。
     *
     * @return mstUserIdのプロパティ名
     */
    public static PropertyName<Long> mstUserId() {
        return new PropertyName<Long>("mstUserId");
    }

    /**
     * mstUserのプロパティ名を返します。
     *
     * @return mstUserのプロパティ名
     */
    public static _MstUserNames mstUser() {
        return new _MstUserNames("mstUser");
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
    public static class _TrnViewHistoryNames extends PropertyName<TrnViewHistory> {

        /**
         * インスタンスを構築します。
         */
        public _TrnViewHistoryNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _TrnViewHistoryNames(final String name) {
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
        public _TrnViewHistoryNames(final PropertyName<?> parent, final String name) {
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
         * mstUserIdのプロパティ名を返します。
         *
         * @return mstUserIdのプロパティ名
         */
        public PropertyName<Long> mstUserId() {
            return new PropertyName<Long>(this, "mstUserId");
        }

        /**
         * mstUserのプロパティ名を返します。
         *
         * @return mstUserのプロパティ名
         */
        public _MstUserNames mstUser() {
            return new _MstUserNames(this, "mstUser");
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