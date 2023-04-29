package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.DeadLock;

public class LockR2 {
    private static LockR2 lockR2;

    public static LockR2 getLock() {
        if (null == lockR2) {
            synchronized (LockR2.class){
                if (null == lockR2){
                    lockR2 = new LockR2();
                }
            }
        }
        return lockR2;
    }
}
