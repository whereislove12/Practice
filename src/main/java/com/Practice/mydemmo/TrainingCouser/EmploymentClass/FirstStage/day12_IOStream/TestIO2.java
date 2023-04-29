package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 缓冲流,也叫高效流，是对4个基本的 FileXxx 流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流： BufferedInputStream ， BufferedOutputStream
 * 字符缓冲流： BufferedReader ， BufferedWriter
 * 缓冲流的基本原理:
 * 在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从 而提高读写的效率。
 * ************************************************************************************************
 * 字节缓冲流
 * 构造方法:
 * public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
 * public BufferedOutputStream(OutputStream out) ： 创建一个新的缓冲输出流。
 * 字符缓冲流
 * 构造方法:
 * public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
 * public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
 * 特有方法 :
 * BufferedReader： public String readLine() : 读一行文字。
 * BufferedWriter： public void newLine() : 写一行行分隔符,由系统属性定义符号。
 */
public class TestIO2 {
    /**
     * 测试字节缓冲流复制文件
     */
    @Test
    public void testCopyFile() {
        String filePath = "src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\洛圣都1.jpeg";
        try {
            IOTool3.copyFileWithFileStream(filePath, null, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试字符缓冲流复制文本文件
     */
    @Test
    public void testCopyFileWithReadWriter() {
        String filePath = "src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\b.txt";
        try {
            IOTool3.copyFileWithReadWriter(filePath, null, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 给出师表内的语句排序
     */
    @Test
    public void test1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\chushibiao.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\chushibiao" + System.currentTimeMillis() + ".txt"));

        List<String> strs = new ArrayList<>();

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            strs.add(line);
        }

        Collections.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });

        for (String str : strs) {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
