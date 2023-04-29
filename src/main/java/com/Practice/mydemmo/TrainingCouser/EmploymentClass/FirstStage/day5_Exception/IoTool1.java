package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import java.io.*;

/**
 * io复制工具类
 */
public class IoTool1 {
    /**
     * 复制文字文件
     */
    public static void copyFileWithWord(String sourceFilePath, String targetPath, String newName) throws Exception {
        if (null == sourceFilePath || "" == sourceFilePath) {
            throw new Exception("文件路径为空");
        }
        /**
         * 字节数如流和字节输出流,复制文字
         */
        InputStreamReader inputStreamReader;
        OutputStreamWriter outputStreamWriter;

        File file = new File(sourceFilePath);
        targetPath = dealWithPath(file, newName, targetPath);

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(targetPath);

        inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        int read;
        try {
            while (-1 != (read = inputStreamReader.read())) {
                outputStreamWriter.write(read);
            }
        } catch (IOException e) {
            throw new IOException(e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        /**
         * finally：
         * 有一些特定的代码无论异常是否发生，都需要执行
         */ finally {
            fileOutputStream.close();
            fileInputStream.close();
            inputStreamReader.close();
        }
    }

    /**
     * 复制文件
     *
     * @param sourceFilePath
     * @param targetPath
     * @param newName
     * @throws Exception
     */
    public static void copyFile(String sourceFilePath, String targetPath, String newName) throws Exception {
        if (null == sourceFilePath || "" == sourceFilePath) {
            throw new Exception("文件路径为空");
        }

        File file = new File(sourceFilePath);
        targetPath = dealWithPath(file, newName, targetPath);

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(targetPath);

        byte[] buffer = new byte[1024];
        int length = 0;
        try {
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new IOException(e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        /**
         * finally：
         * 有一些特定的代码无论异常是否发生，都需要执行
         */ finally {
            fileOutputStream.close();
            fileInputStream.close();
        }
    }

    /**
     * 处理文件名,防止为空
     *
     * @param file
     * @param newName
     */
    public static String dealWithPath(File file, String newName, String targetPath) {
        String fileFullName = file.getName();
        String suffix = fileFullName.substring(fileFullName.lastIndexOf("."));
        if (null == newName || "" == newName) {
            //file.getName();
            newName = fileFullName.substring(0, fileFullName.lastIndexOf(".")) + suffix;
        } else {
            newName = newName + suffix;
        }
        targetPath = targetPath + "\\" + newName;
        return targetPath;
    }
}
