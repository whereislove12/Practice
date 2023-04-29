package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming.UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyServerSocket4 {
    public static void main(String[] args) throws IOException, InterruptedException {

        //开启线程用来接收客户端连接
        /**
         * corePoolSize:核心线程池大小
         * maximumPoolSize：最大线程池大小
         * keepAliveTime：线程最大空闲时间，0L:该参数默认对核心线程无效，而FixedThreadPool全部为核心线程；
         * TimeUnit:时间单位
         *
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 200, 3L, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(1024), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        try {
            //1.开启服务端socket，创建服务器serverSocket对象和系统要指定的端口号
            ServerSocket server = new ServerSocket(8888);
            while (true) {
                //2.使用ServerSocket对象中的accept()方法，获取请求客户端的socket
                Socket socket = server.accept();
                //开启线程，这里实现了每连接一个客户端就开启一个线程
                Runnable runnable = () -> {
                    try {
                        //3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
                        InputStream inputStream = socket.getInputStream();
                        //使用DataInputStream，输出流会按照一定的格式将数据输出，在通过数据输入流按照一定的格式将数据读入，这样就可以方便的对数据进行处理
                        DataInputStream ds = new DataInputStream(inputStream);
                        //读取传过来的文件名
                        String fileNames = ds.readUTF();
                        System.out.println("传过来的文件名是：" + fileNames);
                        //4.判断文件夹是否存在
                        File file = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day14_NetworkProgramming\\UploadFile\\Files");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //防止文件重复
                        String fileName = fileNames.substring(0, fileNames.lastIndexOf("."))
                                + System.currentTimeMillis()
                                + fileNames.substring(fileNames.lastIndexOf("."));

                        //5.创建一个本地字节输出流FileOutputStream对象，构造方法要绑定输出的目的地
                        FileOutputStream fo = new FileOutputStream(file + "\\" + fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024 * 1024];
                        //6.使用InputStream汇总的read()，读取客户端上传的文件,这里我们使用数组来做，效率比较快
                        while ((len = inputStream.read(bytes)) != -1) {
                            //7.使用本地输出流对象FileOutputStream对象中的write()，把读取到的文件保存在服务器的硬盘上
                            fo.write(bytes, 0, len);
                        }
                        System.out.println("文件上传到：" + file + "\\" + fileName);
                        //8.使用socket对象中的getOutputStream，获取网络字节输出流OutputStream
                        //9.使用OutputStream对象的write，回响客户端数据“上传成功”
                        socket.getOutputStream().write("上传成功".getBytes());
                        fo.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("上传错误");
                    }
                };
                threadPoolExecutor.execute(runnable);
            }
            //这里服务器不用关闭了
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("服务器关闭");
    }
}


