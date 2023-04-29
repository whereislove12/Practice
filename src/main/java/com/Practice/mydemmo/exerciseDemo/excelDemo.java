package com.Practice.mydemmo.exerciseDemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author: XYT
 * @create-date: 2022/8/4 19:29
 */
public class excelDemo {

    @Test
    public void test01() throws IOException {
        String excelPath = "";

        FileInputStream fileInputStream = new FileInputStream(excelPath);//开启文件读取流
        XSSFWorkbook sheets = new XSSFWorkbook(fileInputStream);//读取文件

        for (Sheet sheet : sheets) {
            //遍历每一行
            for (Row rows : sheet) {
                Object o = new Object();

                //第一列
                Cell cell1 = rows.getCell(1);

            }
        }
    }

    @Test
    public void test02(){
        String str = "第一章 哈哈哈哈";

        if (str.contains(" ")){
            System.out.println(str.substring(str.indexOf(" ")+1));
        }
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.20.98.228",9000);
        ServerSocketChannel.open();
        //send to server
        socket.getOutputStream().write("hello server ...".getBytes());
        socket.getOutputStream().flush();
        System.out.println("send to server done ...");
        byte[] bytes = new byte[1024];
        int read = socket.getInputStream().read(bytes);
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes,0,read);
        String str = StandardCharsets.UTF_8.decode(byteBuffer).toString();
        System.out.println("get message from server:"+str);
        socket.close();
    }

}
