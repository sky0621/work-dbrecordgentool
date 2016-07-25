package xyz.skycat.work.dbrecordgentool.entity;

import javax.annotation.Generated;
import xyz.skycat.work.dbrecordgentool.entity.MstCategoryNames._MstCategoryNames;
import xyz.skycat.work.dbrecordgentool.entity.MstMovieNames._MstMovieNames;
import xyz.skycat.work.dbrecordgentool.entity.MstRecommendNames._MstRecommendNames;
import xyz.skycat.work.dbrecordgentool.entity.MstUserNames._MstUserNames;
import xyz.skycat.work.dbrecordgentool.entity.RelCategoryMovieNames._RelCategoryMovieNames;
import xyz.skycat.work.dbrecordgentool.entity.RelRecommendMovieNames._RelRecommendMovieNames;
import xyz.skycat.work.dbrecordgentool.entity.TrnFavoriteNames._TrnFavoriteNames;
import xyz.skycat.work.dbrecordgentool.entity.TrnViewHistoryNames._TrnViewHistoryNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2016/07/26 0:00:03")
public class Names {

    /**
     * {@link MstCategory}の名前クラスを返します。
     * 
     * @return MstCategoryの名前クラス
     */
    public static _MstCategoryNames mstCategory() {
        return new _MstCategoryNames();
    }

    /**
     * {@link MstMovie}の名前クラスを返します。
     * 
     * @return MstMovieの名前クラス
     */
    public static _MstMovieNames mstMovie() {
        return new _MstMovieNames();
    }

    /**
     * {@link MstRecommend}の名前クラスを返します。
     * 
     * @return MstRecommendの名前クラス
     */
    public static _MstRecommendNames mstRecommend() {
        return new _MstRecommendNames();
    }

    /**
     * {@link MstUser}の名前クラスを返します。
     * 
     * @return MstUserの名前クラス
     */
    public static _MstUserNames mstUser() {
        return new _MstUserNames();
    }

    /**
     * {@link RelCategoryMovie}の名前クラスを返します。
     * 
     * @return RelCategoryMovieの名前クラス
     */
    public static _RelCategoryMovieNames relCategoryMovie() {
        return new _RelCategoryMovieNames();
    }

    /**
     * {@link RelRecommendMovie}の名前クラスを返します。
     * 
     * @return RelRecommendMovieの名前クラス
     */
    public static _RelRecommendMovieNames relRecommendMovie() {
        return new _RelRecommendMovieNames();
    }

    /**
     * {@link TrnFavorite}の名前クラスを返します。
     * 
     * @return TrnFavoriteの名前クラス
     */
    public static _TrnFavoriteNames trnFavorite() {
        return new _TrnFavoriteNames();
    }

    /**
     * {@link TrnViewHistory}の名前クラスを返します。
     * 
     * @return TrnViewHistoryの名前クラス
     */
    public static _TrnViewHistoryNames trnViewHistory() {
        return new _TrnViewHistoryNames();
    }
}