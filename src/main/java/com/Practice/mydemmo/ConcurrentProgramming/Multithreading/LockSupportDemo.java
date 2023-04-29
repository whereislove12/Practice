package com.Practice.mydemmo.ConcurrentProgramming.Multithreading;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

/**
 * 交替输出两个数组中内容
 */
public class LockSupportDemo {
    private Thread t1;
    private Thread t2;

    @Test
    public void demo01() {
        char[] letter = "abcdefg".toCharArray();
        char[] nums = "1234567".toCharArray();

        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (char c : letter) {
                    System.out.println(c);
                    LockSupport.unpark(t2);
                    LockSupport.park();
                }
            }
        });

        t2 = new Thread(() -> {
            for (char num : nums) {
                LockSupport.park();
                System.out.println(num);
                LockSupport.unpark(t1);
            }
        });

        t1.start();
        t2.start();
    }
}
