package ex040;
/*
 * TestArgs.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */
import myutil.ArgsUtil;

public class TestArgs {
    public static void main(String[] args) {

        String file = ArgsUtil.parseArgs(args);
        if ( file!=null ) {
            System.out.println("入力ファイルは、" + file + "です");
        }
    }
}
