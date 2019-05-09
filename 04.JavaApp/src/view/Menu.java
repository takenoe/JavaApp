package view;

import myutil.UserInput;

public class Menu {

	//メニューを表示する
	public static void show() {
		System.out.println("社員名簿管理ツール");
		System.out.println("１.レコードの一覧");
		System.out.println("２.レコードの検索");
		System.out.println("３.レコードの新規登録");
		System.out.println("４.レコードの削除");
		System.out.println("５.レコードの修正");
		System.out.println("６.平均値の表示");
		System.out.println("０.終了");

	}
	public static int getNo() {

		int inputint;
		//メニューを呼び出す
		do {
			show();
			inputint = UserInput.getNumber("番号を入出力してください：");
		}while(inputint < 0||inputint > 6); {
		return inputint;
	}
	}
}
