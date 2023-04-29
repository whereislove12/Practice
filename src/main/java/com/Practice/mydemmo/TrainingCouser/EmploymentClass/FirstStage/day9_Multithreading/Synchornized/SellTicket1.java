package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.Synchornized;

/**
 * 电影院要卖票，我们模拟电影院的卖票过程。假设要播放的电影是 “葫芦娃大战奥特曼”，本次电影的座位共100个(本场电影 只能卖100张票)。
 * 线程不安全
 */
public class SellTicket1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售" + ticket + "张票");
                ticket--;
            } else {
                break;
            }
        }
    }
}
