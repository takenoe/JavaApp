package view;

import myutil.HealthCalc;
import vo.EmpVO;

public class EmpPrintInfo {
	public static void printHeader() {
		//ヘッダー表示
		System.out.println("番号\t氏名\t\t\t身長\t体重\t適正体重\t偏差");
	}
	public static void printInfo(EmpVO empVO) {
		String BestWeight = HealthCalc.calcBestWeight(empVO.getHeight());
		String WeightDeflection = HealthCalc.calcWeightDeflection(empVO.getWeight(), BestWeight);
		//データ出力
		System.out.print(empVO.getSyainNumber() + "\t");
		System.out.print(empVO.getName() + "\t");
		System.out.print(empVO.getHeight() + "\t" + "\t");
		System.out.print(empVO.getWeight() + "\t");
		System.out.print(BestWeight + "\t" + "\t");
		System.out.println(WeightDeflection);
	}
}
