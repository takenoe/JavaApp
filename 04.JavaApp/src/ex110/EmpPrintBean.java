package ex110;
import dao.EmpDAO;
import view.EmpPrintInfo;

public class EmpPrintBean {
	public void execute(int empNo,String fileName) {
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("é–àıî‘çÜ" + empNo + "ÇÕìoò^Ç≥ÇÍÇƒÇ¢Ç‹ÇπÇÒ");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
		}
	}

}
