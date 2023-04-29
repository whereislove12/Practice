package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer;

/**
 * Condition接口方法和Object类方法比较:
 * 1.Condition可以和任意的Lock组合，也就是实现了线程的分组管理。
 * 一个线程的案例中，可以使用多个Lock锁，每个Lock锁上可以结合Condition对象
 * synchronized同步中做不到线程分组管理
 * 2.Object 类 wait()和 notify() 都要和操作系统交互，并通知CPU挂起线程，唤醒线程，效率低。
 * 3.Condition接口方法await()不和操作系统交互，而是让释放锁，并存放到线程队列容器中，当被signal()唤醒后，从队列中出来，从新获取锁后在执行。
 * 4.使用Lock和Condition的效率比Object要快很多。
 */
public class ConditionObjectDifferent {
}
