package sample;
/*
 * TestFile.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */
import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File file = new File(args[0]);

        if ( file.exists() == true) {
            System.out.println(args[0] + "ファイルはあります");
        }
        else {
            System.out.println(args[0] + "ファイルはありません");
        }
    }
}
