package myutil;
import java.math.BigDecimal;

public class HealthCalc {
	public static String calcBestWeight(String Height) {

		//身長の型変換
		int intHeight = Integer.parseInt(Height);

		//適正体重の計算と四捨五入
		double bestWeight = (intHeight - 100) * 0.9;
		BigDecimal calc = new BigDecimal(bestWeight);
		calc = calc.setScale(1,BigDecimal.ROUND_HALF_UP);

		//型変換
		String str =  calc.toString();
		return str;
	}
	public static String calcWeightDeflection(String weight, String bestWeight) {
		//身長体重の型変換
		double intweight = Double.parseDouble(weight);
		double intbestWeight = Double.parseDouble(bestWeight);

		//偏差の計算
		double WeightDeflection = intweight - intbestWeight;

		//四捨五入
		BigDecimal calc = new BigDecimal(WeightDeflection);
		calc = calc.setScale(1,BigDecimal.ROUND_HALF_UP);

		//型変換
		String str =  calc.toString();
		return str;
	}
}
