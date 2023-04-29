package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day11_IOStream.IO;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * java.io.OutputStream 抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出 流的基本共性功能方法。
 * public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 * public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
 * public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 * public abstract void write(int b) ：将指定的字节输出流
 * ********************************************************************************************************************
 * java.io.FileOutputStream 类是文件输出流，用于将数据写出到文件。
 * 构造方法:
 * public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
 * public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。
 * 写出字节：write(int b) 方法，每次可以写出一个字节数据
 * 写出字节数组：write(byte[] b) ，每次可以写出数组中的数据
 * 写出指定长度字节数组： write(byte[] b, int off, int len) ,每次写出从off索引开始，len表示写出的个字节个数。
 * 数据追加续写:
 * public FileOutputStream(File file, boolean append) ： 创建文件输出流以写入由指定的 File对象表示的文件。
 * public FileOutputStream(String name, boolean append) ： 创建文件输出流以指定的名称写入文件。
 * ********************************************************************************************************************
 * java.io.InputStream 抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基 本共性功能方法。
 * public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。 public abstract int read() ： 从输入流读取数据的下一个字节。
 * public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
 * ********************************************************************************************************************
 * java.io.FileInputStream 类是文件输入流，从文件中读取字节。
 * 构造方法 :
 * FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
 * FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
 * 读取字节： read 方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回 -1
 * 使用字节数组读取: read(byte[] b) ，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回 -1
 */
public class TestIO1 {
    /**
     * 字节输入流
     */
    @Test
    public void test1() {
        File file = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\b.txt");
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 字符输入流
     */
    @Test
    public void test2() {
        File file = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\b.txt");
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试字节流复制文件
     */
    @Test
    public void testCopyFile() {
        String filePath = "src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\洛圣都1.jpeg";
        try {
            IOTool2.copyFileWithFileStream(filePath, null, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试字符流复制文本文件
     */
    @Test
    public void testCopyFileWithReadWriter() {
        String filePath = "src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\b.txt";
        try {
            IOTool2.copyFileWithReadWriter(filePath, null, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
