package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.Synchornized;

/**
 * Java中提供了同步机制 (synchronized)来解决线程安全问题
 * 有三种方式完成同步操作：
 * 1. 同步代码块。
 * 2. 同步方法。
 * 3. 锁机制。
 * 同步锁是谁:
 * 对于非static方法,同步锁就是this。
 * 对于static方法,我们使用当前方法所在类的字节码对象(类名.class)。
 */
public class SellTicket2 implements Runnable {
    private int ticket = 1000;
    //private Object objectLock = new Object();

    @Override
    public void run() {
        while (true) {
            /**
             * 同步代码块
             */
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
