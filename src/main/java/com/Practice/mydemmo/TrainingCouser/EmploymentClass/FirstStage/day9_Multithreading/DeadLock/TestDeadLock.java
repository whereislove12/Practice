package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.DeadLock;

/**
 * 测试死锁
 */
public class TestDeadLock {
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);

        new Thread(d1).start();
        new Thread(d2).start();
    }
}
