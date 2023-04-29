package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.Logging;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LoggingServer {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                20,
                50,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(50),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        Properties properties = new Properties();
        properties.load(new FileReader("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day14_NetworkProgramming\\Logging\\loggingMessage.properties"));

        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            threadPoolExecutor.execute(() -> {
                try {
                    InputStream inputStream = socket.getInputStream();
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                    String userName = bufferedReader.readLine();
                    String password = bufferedReader.readLine();

                    OutputStream outputStream = socket.getOutputStream();
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

                    String saveUserName = properties.getProperty("userName");
                    String savePassword = properties.getProperty("password");

                    if (saveUserName.equals(userName)
                            && savePassword.equals(password)) {
                        bufferedWriter.write("登陆成功");
                    } else {
                        bufferedWriter.write("用户名或密码不正确");
                    }

                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    bufferedReader.close();
                    bufferedWriter.close();

                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }
}
