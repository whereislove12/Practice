package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.Socket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket类：这个类实现了服务器套接字，该对象等待通过网络的请求。
 * 构造方法:
 * public ServerSocket(int port)` ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。
 * 成员方法:
 * public Socket accept()` ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。
 */
public class MyServerSocket1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes,0,len));
        accept.shutdownInput();
        accept.close();
        serverSocket.close();
    }
}
