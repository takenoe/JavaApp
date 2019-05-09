package ex020;

import myutil.UserInput;

/*
 * TestInput.java
 *
 * Copyright(c) 2013 Nihon Unisys, Ltd.
 * All rights reserved.
 */
public class TestInput {
    /**
    *
    */
    public static void main(String[] args) {
        String str = null;
        int number = 0;

        // Util.getString()をテストします。
        System.out.println("テストID2：任意の文字列の入力テスト1");
        System.out.print("　任意の文字列を入力して下さい:" );
        str = UserInput.getString();
        System.out.println(" getString()の返却値は、 " + str + " です");
        System.out.println();

        // Util.getString(String title)をテストします。
        System.out.println("テストID3：任意の文字列の入力テスト2");
        str = UserInput.getString("**任意の文字列を入力して下さい->");
        System.out.println(" getString(String str)の返却値は、 " + str + " です");
        System.out.println();

        // Util.getNumber()をテストします。
        System.out.println("テストID4：数値の文字列の入力テスト3");
        System.out.print("　数値（>0)の文字列を入力して下さい:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()の返却値は、 " + number + " です");
        System.out.println();

        // Util.getNumber()をテストします。
        System.out.println("テストID5：数値の文字列の入力テスト");
        System.out.print("　数値（<0)の文字列を入力して下さい:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()の返却値は、 " + number + " です。（期待値：-1)");
        System.out.println();

        // Util.getNumber()をテストします。
        System.out.println("テストID6：数値の文字列の入力テスト");
        System.out.print("　数値以外の文字列を入力して下さい:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()の返却値は、 " + number + " です。（期待値：-1)");
        System.out.println();

        // Util.getNumber(String title)をテストします。
        System.out.println("テストID7：数値の文字列の入力テスト3");
        number = UserInput.getNumber("**数値（>0)の文字列を入力して下さい->" );
        System.out.println(" getNumber()の返却値は、 " + number + " です");
        System.out.println();

        // Util.getNumber(String title)をテストします。
        System.out.println("テストID8：数値の文字列の入力テスト");
        number = UserInput.getNumber("**数値（<0)の文字列を入力して下さい->" );
        System.out.println(" getNumber()の返却値は、 " + number + " です。（期待値：-1)");
        System.out.println();

        // Util.getNumber(String title)をテストします。
        System.out.println("テストID9：数値の文字列の入力テスト");
        number = UserInput.getNumber("**数値以外の文字列を入力して下さい->" );
        System.out.println(" getNumber()の返却値は、 " + number + " です。（期待値：-1)");
        System.out.println();
      }
}