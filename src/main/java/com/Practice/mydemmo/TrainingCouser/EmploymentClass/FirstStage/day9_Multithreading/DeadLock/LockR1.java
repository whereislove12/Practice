package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.DeadLock;

public class LockR1 {
    private static LockR1 lockR1;

    /**
     * 双重检查锁,第一层是为了效率
     *
     * @return
     */
    public static LockR1 getLock() {
        if (null == lockR1) {
            synchronized (LockR1.class) {
                if (null == lockR1) {
                    lockR1 = new LockR1();
                }
            }
        }
        return lockR1;
    }
}
