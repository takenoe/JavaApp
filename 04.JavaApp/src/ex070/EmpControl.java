package ex070;

import ex050.AllEmpPrintBean;
import myutil.ArgsUtil;
import myutil.UserInput;
import view.Menu;

public class EmpControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			//データファイルの確認
			ArgsUtil.parseArgs(args);
			System.out.println(" ");
			while(true){
			//メニュー番号を選択する
			switch(Menu.getNo()) {
			case 1:
				AllEmpPrintBean bean = new AllEmpPrintBean();

		        bean.execute("syain.txt");

		        break;

			case 2:
				//社員番号で検索
				int Num = UserInput.getNumber("社員番号を入力して下さい：");
				EmpPrintBean prson = new EmpPrintBean();
				prson.execute(Num,args[0]);
				break;

			case 3:
				System.out.println("「3.レコードの新規登録」が選択されました");

				break;
			case 4:
				System.out.println("「4.レコードの削除」が選択されました");

				break;
			case 5:
				System.out.println("「5.レコードの修正」が選択されました");

				break;
			case 6:
				System.out.println("「6.平均値の表示」が選択されました");

				break;
			case 0:
				System.out.println("「0.終了」が選択されました");
				System.out.println("プログラムを終了します");
				System.exit(0);
				break;
			}
			System.out.println(" ");

		}
	}

}
