package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day11_IOStream.File;

import java.io.File;
import java.util.Objects;

/**
 * 文件遍历
 */
public class FileErgodic {
    public static void ergodicPrintFile(String filePath) {
        FileErgodic.ergodicFile(new File(filePath),"");
    }

    private static void ergodicFile(File file, String spacing) {
        if (!file.exists()) {
            return;
        }
        System.out.println(spacing+file.getName());
        spacing+="-";

        File[] files = file.listFiles();
        if (!Objects.isNull(files)) {
            for (File childFile : files) {
                ergodicFile(childFile, spacing);
            }
        }
    }
}
