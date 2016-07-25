package xyz.skycat.work.dbrecordgentool.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import xyz.skycat.work.dbrecordgentool.entity.TrnFavoriteNames._TrnFavoriteNames;
import xyz.skycat.work.dbrecordgentool.entity.TrnViewHistoryNames._TrnViewHistoryNames;

/**
 * {@link MstUser}のプロパティ名の集合です。YO
 *
 */gaagagaga
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/26 0:00:03")
public class MstUserNames {

    /**
     * idのプロパティ名を返します。
     *
     * @return idのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * userIdのプロパティ名を返します。
     *
     * @return userIdのプロパティ名
     */
    public static PropertyName<String> userId() {
        return new PropertyName<String>("userId");
    }

    /**
     * userPasswordのプロパティ名を返します。
     *
     * @return userPasswordのプロパティ名
     */
    public static PropertyName<String> userPassword() {
        return new PropertyName<String>("userPassword");
    }

    /**
     * delFlgのプロパティ名を返します。
     *
     * @return delFlgのプロパティ名
     */
    public static PropertyName<Boolean> delFlg() {
        return new PropertyName<Boolean>("delFlg");
    }

    /**
     * trnFavoriteListのプロパティ名を返します。
     *
     * @return trnFavoriteListのプロパティ名
     */
    public static _TrnFavoriteNames trnFavoriteList() {
        return new _TrnFavoriteNames("trnFavoriteList");
    }

    /**
     * trnViewHistoryListのプロパティ名を返します。
     *
     * @return trnViewHistoryListのプロパティ名
     */
    public static _TrnViewHistoryNames trnViewHistoryList() {
        return new _TrnViewHistoryNames("trnViewHistoryList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstUserNames extends PropertyName<MstUser> {

        /**
         * インスタンスを構築します。
         */
        public _MstUserNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _MstUserNames(final String name) {
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
        public _MstUserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Long> id() {
            return new PropertyName<Long>(this, "id");
        }

        /**
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<String> userId() {
            return new PropertyName<String>(this, "userId");
        }

        /**
         * userPasswordのプロパティ名を返します。
         *
         * @return userPasswordのプロパティ名
         */
        public PropertyName<String> userPassword() {
            return new PropertyName<String>(this, "userPassword");
        }

        /**
         * delFlgのプロパティ名を返します。
         *
         * @return delFlgのプロパティ名
         */
        public PropertyName<Boolean> delFlg() {
            return new PropertyName<Boolean>(this, "delFlg");
        }

        /**
         * trnFavoriteListのプロパティ名を返します。
         *
         * @return trnFavoriteListのプロパティ名
         */
        public _TrnFavoriteNames trnFavoriteList() {
            return new _TrnFavoriteNames(this, "trnFavoriteList");
        }

        /**
         * trnViewHistoryListのプロパティ名を返します。
         *
         * @return trnViewHistoryListのプロパティ名
         */
        public _TrnViewHistoryNames trnViewHistoryList() {
            return new _TrnViewHistoryNames(this, "trnViewHistoryList");
        }
    }
}