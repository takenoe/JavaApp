package dao_stub;
/*
 * EmpDAO.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {
    /**
    * コンストラクタ<br>
    *
    * @param fileName
    */
    public EmpDAO(String fileName) {

    }

    public List<EmpVO> getAll() {
    	ArrayList<EmpVO> list = new ArrayList<>();
    	//織田信長
    	EmpVO vo1 = new EmpVO();
    	vo1.setSyainNumber("641340");
    	vo1.setHeight("160");
        vo1.setName("Oda Nobunaga");
        vo1.setWeight("40.0");

        list.add(vo1);

        //徳川家康
        EmpVO vo2 = new EmpVO();
        vo2.setSyainNumber("213426");
    	vo2.setHeight("174");
        vo2.setName("Tokugawa Ieyasu");
        vo2.setWeight("75.0");

        list.add(vo2);

        return list;
    }
}
