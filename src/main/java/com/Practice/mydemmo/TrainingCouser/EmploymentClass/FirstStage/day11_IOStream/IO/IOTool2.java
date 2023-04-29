package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day11_IOStream.IO;

import java.io.*;
import java.util.Objects;

public class IOTool2 {
    /**
     * 用字节流赋值文件
     */
    public static void copyFileWithFileStream(String originFilePath, String targetFilePath, String newFileName) throws IOException {
        File originFile = new File(originFilePath);
        if (!originFile.exists()) {
            throw new RuntimeException("要复制的源文件不存在");
        }

        if (Objects.isNull(newFileName) || newFileName == "") {
            newFileName = originFile.getName().substring(0, originFile.getName().indexOf(".")) + System.currentTimeMillis()
                    + originFile.getName().substring(originFile.getName().lastIndexOf("."));
        }
        if (Objects.isNull(targetFilePath) || targetFilePath == "") {
            targetFilePath = originFile.getParent() + "\\";
        }
        targetFilePath += newFileName;

        InputStream fileInputStream = new FileInputStream(originFile);
        OutputStream fileOutputStream = new FileOutputStream(targetFilePath);

        int len;
        byte[] bytes = new byte[1024];

        while (-1 != (len = fileInputStream.read(bytes))) {
            fileOutputStream.write(bytes, 0, len);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }

    /**
     * 用字符流复制文件
     *
     * @param originFilePath
     * @param targetFilePath
     * @param newFileName
     * @throws IOException
     */
    public static void copyFileWithReadWriter(String originFilePath, String targetFilePath, String newFileName) throws IOException {
        File originFile = new File(originFilePath);
        if (!originFile.exists()) {
            throw new RuntimeException("要复制的源文件不存在");
        }

        if (Objects.isNull(newFileName) || newFileName == "") {
            newFileName = originFile.getName().substring(0, originFile.getName().indexOf(".")) + System.currentTimeMillis()
                    + originFile.getName().substring(originFile.getName().lastIndexOf("."));
        }
        if (Objects.isNull(targetFilePath) || targetFilePath == "") {
            targetFilePath = originFile.getParent() + "\\";
        }
        targetFilePath += newFileName;

        Reader fileReader = new FileReader(originFile);
        Writer fileWriter = new FileWriter(targetFilePath);

        int len = 0;
        char[] chars = new char[1024];
        while (-1 != (len = fileReader.read(chars))) {
            fileWriter.write(chars, 0, len);
        }

        fileReader.close();
        fileWriter.close();
    }
}
