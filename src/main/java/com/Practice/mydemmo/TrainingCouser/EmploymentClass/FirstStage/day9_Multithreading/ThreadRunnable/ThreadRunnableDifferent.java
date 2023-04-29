package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.ThreadRunnable;

/**
 * 如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享。
 * 总结：
 * 实现Runnable接口比继承Thread类所具有的优势：
 * 1. 适合多个相同的程序代码的线程去共享同一个资源。
 * 2. 可以避免java中的单继承的局限性。
 * 3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立
 */
public class ThreadRunnableDifferent {
}
