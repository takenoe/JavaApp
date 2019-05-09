package myutil;

import java.io.File;

public class ArgsUtil {
	public static String parseArgs(String[] args) {
		//Fileクラスを使用
		if (args.length != 1){
		    System.out.println("引数が指定されていません");
		    System.exit(0);
		  }

		//Fileプロジェクト作成
		File file = new File(args[0]);

		//ファイルの存在確認
		if(file.exists() == false) {
	    	  System.out.println(args[0] + "ファイルが存在しません");
	    	  System.exit(0);
	    }
		return args[0];
	}
}
