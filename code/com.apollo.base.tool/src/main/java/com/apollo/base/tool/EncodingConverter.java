/*
 * 此代码创建于 2016年6月3日 上午9:56:27。
 */
package com.apollo.base.tool;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class EncodingConverter {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("The target must enter.");
            System.exit(-1);
        }

        String target = args[0];
        String oldEncoding = args.length >= 2 ? args[1] : "GBK";
        String newEncoding = args.length >= 3 ? args[2] : "UTF-8";

        System.out.println("Begin convert " + target + ". " + oldEncoding + " to " + newEncoding);

        for (File file : FileUtils.listFiles(new File(target), new String[] { "java", "xml" }, true)) {
            String path = target + file.getAbsolutePath().substring(target.length());
            System.out.println("Convert " + path);

            try {
                FileUtils.writeLines(new File(path), newEncoding, FileUtils.readLines(file, oldEncoding));

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("End convert " + target);
    }

}
