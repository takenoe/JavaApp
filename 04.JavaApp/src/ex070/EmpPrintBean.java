package ex070;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import myutil.HealthCalc;

public class EmpPrintBean {
	public void execute(int empNo,String file) {
		//登録しているかの確認
		int check = -1;
		try (BufferedReader in = new BufferedReader(new FileReader(new File(file)))){

			if(!in.ready()) {
				System.out.println(file + "には、社員情報が一件も存在しません");
				return;
			}
            //ファイルが存在しない場合に例外が発生するので確認する
			String line;

            while((line = in.readLine()) != null){
            	String[] data = line.split(",");
            	int f = Integer.parseInt(data[0]);
            	if(f == empNo) {
            		//ヘッダー表示
            		System.out.println("番号　　氏名　　　　　　身長　　体重　　適正体重　　偏差");
            		String BestWeight = HealthCalc.calcBestWeight(data[2]);
            		String WeightDeflection = HealthCalc.calcWeightDeflection(data[3], BestWeight);
            		System.out.print(data[0] + "\t");
            		System.out.print(data[1] + "\t");
            		System.out.print(data[2] + "\t" + "\t");
            		System.out.print(data[3] + "\t");
            		System.out.print(BestWeight + "\t" + "\t");
            		System.out.println(WeightDeflection);
            		//登録あり
            		check = 1;
            	}
            //登録なし
            }if(check == -1) {
        		System.out.println("社員番号" + empNo + "は登録されていません");
        	}


        }catch (IOException e) {
            e.printStackTrace();
        }
	}
}
