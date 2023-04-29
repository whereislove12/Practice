package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestIO3 {
    /**
     * 转换流指定编码复制文件
     *
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream(new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\chushibiao.txt")),
                "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\chushibiao" + System.currentTimeMillis() + "-GBK.txt"), "GBK");
        int len = 0;
        char[] chars = new char[1024];
        while (-1 != (len = inputStreamReader.read(chars))) {
            outputStreamWriter.write(chars, 0, len);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }

    /**
     * 序列化流,将正常的文件以字节输入流形式读取,序列化后输出
     *
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(
                        new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\洛圣都2.jpeg")));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\洛圣都2" + System.currentTimeMillis() + "ObjectStream.jpeg"));

        int len = 0;
        byte[] bytes = new byte[1024];

        while (-1 != (len = bufferedInputStream.read(bytes))) {
            objectOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        objectOutputStream.close();
    }

    /**
     * 反序列化流,将序列化的数据读取,以字节输出流的形式正常输出
     */
    @Test
    public void test3() throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(
                        new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\洛圣都21682238508707ObjectStream.jpeg")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\洛圣都" + System.currentTimeMillis() + "ParseObjectStream.jpeg"));
        int len = 0;
        byte[] bytes = new byte[1024];

        while (-1 != (len = objectInputStream.read(bytes))) {
            bufferedOutputStream.write(bytes, 0, len);
        }

        objectInputStream.close();
        bufferedOutputStream.close();
    }
}
