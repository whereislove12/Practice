package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable;


import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable.MyRunnable;
import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable.MyThread;
import org.junit.jupiter.api.Test;

/**
 * run()方法:
 * 是线程执行的任务方法，每个线程都会调用run()方法执行，我们将线程要执行的任务代码都写在run()方法 中就可以被线程调用执行。
 * start()方法:
 * 开启线程，线程调用run()方法。start()方法源代码中会调用本地方法start0()来启动线程： private native void start0() ，
 * 本地方法都是和操作系统交互的，因此可以看出每次开启一个线程的线程都会和操作系统进行交互。
 */
public class ThreadTest {
    @Test
    public void testMyThread() {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }

    @Test
    public void testMyRunnable(){
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}
