package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.Logging;

import java.io.*;
import java.net.Socket;

public class LoggingClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        bufferedWriter.write("小红");
        bufferedWriter.newLine();
        bufferedWriter.write("123456");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        socket.shutdownOutput();

        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
