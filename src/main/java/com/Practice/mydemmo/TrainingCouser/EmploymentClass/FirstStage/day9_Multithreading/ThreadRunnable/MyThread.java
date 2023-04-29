package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable;

/**
 * Java使用 java.lang.Thread 类代表线程，所有的线程对象都必须是Thread类或其子类的实例。每个线程的作用是完成一 定的任务，
 * 实际上就是执行一段程序流即一段顺序执行的代码。Java使用线程执行体来代表这段程序流。
 * Java中通过继承 Thread类来创建并启动多线程的步骤如下：
 * 1. 定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务,因此把run()方法 称为线程执行体。
 * 2. 创建Thread子类的实例，即创建了线程对象
 * 3. 调用线程对象的start()方法来启动该线程
 * *******************************************************************************
 * Thread类的方法 String getName() 可以获取到线程的名字。
 * Thread类的方法 setName(String name) 设置线程的名字。
 * 通过Thread类的构造方法 Thread(String name) 也可以设置线程的名字。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            // Thread.currentThread()获取当前线程的名称
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
