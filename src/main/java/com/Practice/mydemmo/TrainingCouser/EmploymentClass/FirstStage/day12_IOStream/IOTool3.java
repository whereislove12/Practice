package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

import java.io.*;
import java.util.Objects;

public class IOTool3 {
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

        InputStream fileInputStream = new BufferedInputStream(new FileInputStream(originFile));
        OutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(targetFilePath));

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

        BufferedReader fileReader = new BufferedReader(new FileReader(originFile),1024);
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(targetFilePath));

        String line = null;
        while ((line = fileReader.readLine()) != null) {
            fileWriter.write(line);
            fileWriter.newLine();
        }

        fileReader.close();
        fileWriter.close();
    }
}
