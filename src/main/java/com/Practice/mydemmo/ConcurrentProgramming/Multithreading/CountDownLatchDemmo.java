package com.Practice.mydemmo.ConcurrentProgramming.Multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * 交替输出两个数组中内容
 */
//CountDownLatch 门栓,可以保证线程执行的顺序
public class CountDownLatchDemmo {
    public static void main(String[] args) {
        char[] strs = "ABCDEFG".toCharArray();
        char[] nums = "1234567".toCharArray();

        final Object lock = new Object();

        //门栓
        CountDownLatch countDownLatch = new CountDownLatch(1);

        new Thread(() -> {
            try {
                //插上门栓
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                for (char str : strs) {
                    System.out.println(str);
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                lock.notify();
            }
        }).start();

        new Thread(() -> {
            //放下门栓
            countDownLatch.countDown();
            synchronized (lock) {
                for (char num : nums) {
                    System.out.println(num);
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {

                    }
                }
                lock.notify();
            }
        }).start();
    }
}
