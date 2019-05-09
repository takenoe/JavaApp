package ex080;
/*
 * TestEmpVO02.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import java.util.ArrayList;

import vo.EmpVO;

public class TestEmpVO02 {
    public static ArrayList<EmpVO> getListOfEmpVO() {
    	ArrayList<EmpVO> list = new ArrayList<>();
    	EmpVO vo1 = new EmpVO();
    	vo1.setSyainNumber("641340");
    	vo1.setHeight("160");
        vo1.setName("Oda Nobunaga");
        vo1.setWeight("40.0");

        list.add(vo1);

        //ìøêÏâ∆çN
        EmpVO vo2 = new EmpVO();
        vo2.setSyainNumber("213426");
    	vo2.setHeight("174");
        vo2.setName("Tokugawa Ieyasu");
        vo2.setWeight("75.0");

        list.add(vo2);

        return list;
    }
    public static void printListOfEmpVo(ArrayList<EmpVO> list) {
    	System.out.println("î‘çÜ\téÅñº\t\t\têgí∑\tëÃèd");
    	for (EmpVO str : list) {
    		System.out.print(str.getSyainNumber()+ "\t");
    		System.out.print(str.getName()+ "\t");
    		System.out.print(str.getHeight()+ "\t");
    		System.out.println(str.getWeight()+ "\t");
    	}
    }
    public static void main(String[] args) {

        ArrayList<EmpVO> list = getListOfEmpVO();

        printListOfEmpVo(list);
    }
}
