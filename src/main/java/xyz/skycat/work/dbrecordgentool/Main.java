package xyz.skycat.work.dbrecordgentool;

import xyz.skycat.work.dbrecordgentool.entity.MstMovie;

public class Main {

    public static void main(String[] args) {

        try {
            Parameter p = new Parameter(args);

            // FIXME 投入するデータはExcel管理（テーブル別のファイル）した方が無難
            // FIXME まず、データ投入する対象のテーブルかどうかをテキストファイルから読み込んで
            MstMovie mm = new MstMovie(p);
            mm.operation();

        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }

}
