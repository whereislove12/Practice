package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.UploadFile;

import java.io.*;
import java.net.Socket;

public class MySocket4 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        File file = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day14_NetworkProgramming\\UploadFile\\OriginFile\\洛圣都2.jpeg");
        BufferedInputStream originFileInputStream = new BufferedInputStream(new FileInputStream(file));

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
        dataOutputStream.writeUTF(file.getName());
        dataOutputStream.flush();

        int len;
        byte[] bytes = new byte[1024];

        while (-1 != (len = originFileInputStream.read(bytes))) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.flush();
        //告知服务器传输完毕,否则服务器一直等待
        socket.shutdownOutput();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        bytes = new byte[1024];
        while (-1 != (len = bufferedInputStream.read(bytes))) {
            System.out.println(new String(bytes));
        }

        bufferedOutputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}
