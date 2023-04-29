package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer;

/**
 * sleep() 和 wait()的区别:
 * sleep()是Thread类静态方法，不需要对象锁。
 * wait()方法是Object类的方法，被锁对象调用，而且只能出现在同步中。
 * 执行sleep()方法的线程不会释放同步锁。
 * 执行wait()方法的线程要释放同步锁，被唤醒后还需获取锁才能执行。
 */
public class SleepWaitDifferent {
}
