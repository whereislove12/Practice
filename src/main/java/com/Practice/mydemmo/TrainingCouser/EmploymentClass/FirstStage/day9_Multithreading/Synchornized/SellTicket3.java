package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.Synchornized;

/**
 * 同步方法
 */
public class SellTicket3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            sellTicket();
        }
    }

    /**
     * 同步方法
     */
    private synchronized void sellTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket + "张票");
            ticket--;
        }
    }
}
