package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.TwoPeopleTalk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MySocketB {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("开始和 A 聊天,输入'拜拜'退出");

        Socket socket = new Socket("localhost", 8888);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        executorService.submit(() -> {
            while (true) {
                String str = scanner.nextLine();
                try {
                    outputStream.write(str.getBytes());
                    if ("拜拜".equals(str)) {
                        System.out.println("你结束了聊天");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        executorService.submit(() -> {
            int len;
            byte[] bytes = new byte[1024];
            while (true) {
                try {
                    if (-1 != (len = inputStream.read(bytes))) {
                        String str = new String(bytes, 0, len);
                        System.out.println(str);
                        if ("拜拜".equals(str)) {
                            System.out.println("对方结束聊天");
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
