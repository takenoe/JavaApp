package sample;
/*
 * TestRoundup.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import java.math.BigDecimal;

public class TestRoundup {
    /**
    */
    public static void main(String[] args) {
        /**
        * 例として103.17を四捨五入した値を取得する方法を下記に示す。
        * System.out.println(double_decimal)とすると103.17が表示される。
        */
        double double_decimal = 103.17;
        System.out.println(double_decimal);
        /**
        * 四捨五入して103.2を表示させるにはsetScale()を用いる。
        * 1番目の引数は少数点何桁のBigDecimalを返すかを指定する。
        * 2番目の引数にBigDecimal.ROUND_HALF_UPを指定することにより、
        * 四捨五入処理を行うことが出来る。
        * よって、下記処理後にSystem.out.println(calc)とすると103.2が表示される。
        */
        BigDecimal calc = new BigDecimal(double_decimal);
        calc  = calc.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(calc);
    }
}
