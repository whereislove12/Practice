package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import org.junit.jupiter.api.Test;

/**
 * 测试包子铺
 */
public class TestStreamedBunRestaurant {
    /**
     * 程序出现无效的监视器状态异常。
     * wait()或者notify()方法会抛出此异常。
     * 程序中，wait()或者notify()方法的调用者是this对象。
     * 而this对象在同步中并不是锁对象，只有作为锁的对象才能调用wait()或者notify()方法。
     * 而锁对象是生产者和消费者共享的包子铺对象。
     */
    @Test
    public void test1() {
        SteamedBunRestaurant1 steamedBunRestaurant1 = new SteamedBunRestaurant1(0, false);
        new Thread(new Producer1(steamedBunRestaurant1)).start();
        new Thread(new Consumer1(steamedBunRestaurant1)).start();
    }

    @Test
    public void test2() {
        SteamedBunRestaurant1 steamedBunRestaurant1 = new SteamedBunRestaurant1(0, false);
        new Thread(new Producer2(steamedBunRestaurant1)).start();
        new Thread(new Consumer2(steamedBunRestaurant1)).start();
    }

    @Test
    public void test3(){
        SteamedBunRestaurant2 steamedBunRestaurant2 = new SteamedBunRestaurant2(0,false);
        new Thread(new Producer3(steamedBunRestaurant2)).start();
        new Thread(new Consumer3(steamedBunRestaurant2)).start();
    }

    /**
     * 当开启了多个线程后，数据出现了安全问题。问题就出现在等待和唤醒环节。我们将线程分成了生产者和消费者两个部分，
     * 需要生产者线程唤醒消费者线程，而消费者线程要唤醒生产者线程。但是线程的唤醒是按照队列形式进行，先等待的会先被
     * 唤醒。很可能出现生产者线程又唤醒了生产者线程，消费者线程唤醒了消费者线程
     */
    @Test
    public void test4(){
        SteamedBunRestaurant2 steamedBunRestaurant2 = new SteamedBunRestaurant2(0,false);
        new Thread(new Producer3(steamedBunRestaurant2)).start();
        new Thread(new Producer3(steamedBunRestaurant2)).start();
        new Thread(new Producer3(steamedBunRestaurant2)).start();

        new Thread(new Consumer3(steamedBunRestaurant2)).start();
        new Thread(new Consumer3(steamedBunRestaurant2)).start();
        new Thread(new Consumer3(steamedBunRestaurant2)).start();
    }

    /**
     * 将线程全部唤醒，使用 notifyAll()方法。
     * 全部唤醒后，线程依然不安全，是因为线程判断完标志位后就会等待，当被唤醒后，就不会再判断标志位了，我们必须让线
     * 程在唤醒后，还要继续判断标志位，允许生存才能生产，不运行生产就要继续等待。
     */
    @Test
    public void test5(){
        SteamedBunRestaurant3 steamedBunRestaurant3 = new SteamedBunRestaurant3(0, false);
        new Thread(new Producer4(steamedBunRestaurant3)).start();
        new Thread(new Producer4(steamedBunRestaurant3)).start();
        new Thread(new Producer4(steamedBunRestaurant3)).start();

        new Thread(new Consumer4(steamedBunRestaurant3)).start();
        new Thread(new Consumer4(steamedBunRestaurant3)).start();
        new Thread(new Consumer4(steamedBunRestaurant3)).start();
    }
}
