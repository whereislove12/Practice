package com.Practice.mydemmo.ConcurrentProgramming.Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 交替输出两个数组中内容
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        char[] strs = "abcdefg".toCharArray();
        char[] nums = "1234567".toCharArray();

        Lock lock = new ReentrantLock();
        //相当于队列
        Condition condition = lock.newCondition();

        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (char str : strs) {
                lock.lock();
                System.out.println(str);
                condition.signal();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            countDownLatch.countDown();
            for (char num : nums) {
                lock.lock();
                System.out.println(num);
                condition.signal();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
