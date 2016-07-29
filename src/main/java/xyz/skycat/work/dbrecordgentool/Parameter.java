/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package xyz.skycat.work.dbrecordgentool;

/**
 * @author Shotaro.S
 *
 */
public class Parameter {

	public String dbUrl;
	public String dbUser;
	public String dbPassword;
	// TODO 要見直し
	// public String sysColumnName;
	public String sysColumnValue;

	public Parameter(String... args) {

		// TODO 要見直し
//		check(args);

		this.dbUrl = "xxxx";
		this.dbUser = "xxxx";
		this.dbPassword = "xxxx";
		// TODO 要見直し
		// this.sysColumnName = args[3];
		// this.sysColumnValue = args[4];
		this.sysColumnValue = "dumdum";
	}

	private void check(String... args) {
		// if (args == null || args.length != 5) {
		if (args == null || args.length != 4) {
			usage();
			throw new IllegalArgumentException();
		}
	}

	private static void usage() {

		System.out.println("実行時に下記の引数が必要です。");
		System.out
				.println("args[0] : DB接続文字列（例：\"jdbc:mysql://localhost:3306/xxxx\"）");
		System.out.println("args[1] : DB接続ユーザID（例：\"root\"）");
		System.out.println("args[2] : DB接続パスワード（例：\"xxxxxxxx\"）");
		// TODO 要見直し
		// System.out.println("args[3] : 他（既存）レコードと識別するためのシステムカラム名（例：\"INS_ID\"）");
		// System.out
		// .println("args[4] : args[3]にセットする値（※既存と被らない値にすること）（例：\"xyzAutoGen\"）");
		System.out
				.println("args[3] : システムカラム(INS_ID)にセットする値（※既存と被らない値にすること）（例：\"xyzAutoGen\"）");
	}

}
