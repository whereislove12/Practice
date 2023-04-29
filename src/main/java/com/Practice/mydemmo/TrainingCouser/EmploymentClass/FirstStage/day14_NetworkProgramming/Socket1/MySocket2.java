package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.Socket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MySocket2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        inputStream.close();
        socket.shutdownInput();
        socket.close();
    }
}
