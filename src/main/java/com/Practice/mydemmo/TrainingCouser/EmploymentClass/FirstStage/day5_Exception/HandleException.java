package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 处理异常:
 * Java异常处理的五个关键字：try、catch、finally、throw、throws
 */
public class HandleException {
    @Test
    public void testThrow() {
        int arr[] = {1, 2, 3, 4, 5};
        Integer arrayIndexNum = getArrayIndexNum(arr, 7);
        System.out.println(arrayIndexNum);
    }

    public static void main(String[] args) throws Exception {
        copyFileWithWord("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day5_Exception\\IoDemo\\source\\a.txt",
                "E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day5_Exception\\IoDemo\\target",
                "");
        copyFile("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day5_Exception\\IoDemo\\source\\景色7.jpeg",
                "E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day5_Exception\\IoDemo\\target",
                "");
    }

    /**
     * throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行
     */
    public static Integer getArrayIndexNum(int[] arr, int index) {
        /**
         * 捕获异常：
         * Java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理。
         */
        try {
            return arr[index];
        } catch (Exception e) {
            throw new RuntimeException("输入的数字大于数组长度或小于0");
        }
    }

    /**
     * 声明异常：
     * 将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，而没有捕获处理，那么必须通过throws进行声明，让调用者去处理。
     * <p>
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
            throw new MyException(e);
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
            throw new MyException(e);
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
