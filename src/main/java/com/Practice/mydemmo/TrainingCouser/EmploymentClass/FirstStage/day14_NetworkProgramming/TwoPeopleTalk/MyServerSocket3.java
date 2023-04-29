package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.TwoPeopleTalk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A B 聊天
 */
public class MyServerSocket3 {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket a = serverSocket.accept();
        InputStream aInputStream = a.getInputStream();
        OutputStream aOutputStream = a.getOutputStream();

        Socket b = serverSocket.accept();
        InputStream bInputStream = b.getInputStream();
        OutputStream bOutputStream = b.getOutputStream();

        executorService.submit(() -> {
            int len;
            byte[] bytes = new byte[1024];
            while (true) {
                if (-1 != (len = aInputStream.read(bytes))) {
                    bOutputStream.write(bytes, 0, len);
                }
            }
        });

        executorService.submit(() -> {
            int len;
            byte[] bytes = new byte[1024];
            while (true) {
                if (-1 != (len = bInputStream.read(bytes))) {
                    aOutputStream.write(bytes, 0, len);
                }
            }
        });

    }
}
