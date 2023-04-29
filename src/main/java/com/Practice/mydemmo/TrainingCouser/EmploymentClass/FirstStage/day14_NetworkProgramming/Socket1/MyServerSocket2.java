package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.Socket1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我收到消息啦".getBytes());
        outputStream.close();
        accept.shutdownOutput();
        serverSocket.close();
    }
}
