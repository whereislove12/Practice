package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * java.util.Timer 一种工具，线程用其安排以后在后台线程中执行的任务。
 * 可安排任务执行一次，或者定期重复执行。定时器是使用新建的线程来执行，这样即使主线程main结束了，定时器也依然会继续工作。
 * ***************************************************************
 * 定时方法：
 * public void schedule(TimerTask task,Date firstTime,long period)
 * TimerTask是定时器要执行的任务，一个抽象类，我们需要继承并重写方法 run()
 * firstTime定时器开始执行的时间
 * period时间间隔，毫秒值
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("啦啦啦");
            }
        }, new Date(), 5000);
    }
}
