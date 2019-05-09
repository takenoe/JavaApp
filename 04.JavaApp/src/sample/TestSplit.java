package sample;
/*
 * TestSplit.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

public class TestSplit {
    public static void main(String[] args) {
        String oneRecord = "641340,Oda Nobunaga,160,40.0";

        System.out.println("一行のデータ→" + oneRecord);
        String[] column = oneRecord.split(",");
        System.out.println("コンマで分割したデータ↓");
        for ( String s : column ) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
