package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.DeadLock;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeadLock implements Runnable {
    private boolean flag;

    @Override
    public void run() {
        while (true) {
            if (flag) {
                synchronized (LockR1.getLock()) {
                    System.out.println(Thread.currentThread().getName() + "获取到了锁1");
                    synchronized (LockR2.getLock()) {
                        System.out.println(Thread.currentThread().getName() + "获取到了锁2");
                    }
                }
            } else {
                synchronized (LockR2.getLock()) {
                    System.out.println(Thread.currentThread().getName() + "获取到了锁2");
                    synchronized (LockR1.getLock()) {
                        System.out.println(Thread.currentThread().getName() + "获取到了锁1");
                    }
                }
            }
        }
    }
}
