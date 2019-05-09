package myutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	//ユーザー入力
	public static String getString() {
		//変数名の定義
		String inputString ="";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			inputString = br.readLine();
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.exit(0);
		}
		return inputString;

	}
	public static String getString(String title) {
		//タイトル表示
		System.out.println(title);
		//getStringの再利用
		return UserInput.getString();

	}
	public static int getNumber() {
		//getStringの再利用
		try {
			int inputint = 0;
			//int型に変換
			inputint = Integer.parseInt(UserInput.getString());
		    if(inputint >= 0) {
		    	return inputint;
		    }else {
		    	return -1;
		    }
		} catch (NumberFormatException e) {
		        return -1;
		}
	}

	public static int getNumber(String title) {
		//タイトル表示
		System.out.println(title);
		//getNumberの再利用
		return getNumber();
	}
}
