package ex050;

/*
 * TestHealthCalc.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import myutil.HealthCalc;
import myutil.UserInput;

public class TestHealthCalc {
    public static void main(String[] args) {
        int h = UserInput.getNumber("身長を入力して下さい:");

        // 適正体重の計算をする。
        String height = Integer.toString(h);
        String bestWeight = HealthCalc.calcBestWeight(height);
        System.out.println("身長" + height + "cmの適正体重は " + bestWeight + "kg です");

        // 偏差を計算する。
        int w = UserInput.getNumber("体重を入力して下さい:");
        String weight = Integer.toString(w);
        String weightDeflection = HealthCalc.calcWeightDeflection(weight, bestWeight);
        System.out.println("偏差は " + weightDeflection + "です");
    }
}
