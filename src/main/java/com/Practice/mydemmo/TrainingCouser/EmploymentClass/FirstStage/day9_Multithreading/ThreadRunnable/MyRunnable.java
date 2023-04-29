package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable;

/**
 * 采用 java.lang.Runnable 也是非常常见的一种，我们只需要重写run方法即可。 步骤如下：
 * 1. 定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
 * 2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
 * 3. 调用线程对象的start()方法来启动线程。
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
