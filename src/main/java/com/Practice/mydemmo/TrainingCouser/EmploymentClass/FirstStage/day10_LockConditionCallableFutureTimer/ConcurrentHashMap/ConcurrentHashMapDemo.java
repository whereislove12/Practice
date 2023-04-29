package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java.util.concurrent.ConcurrentHashMap 支持获取的完全并发和更新的所期望可调整并发的哈希表。
 * 此集合实现Map接口，因此Map集合中的所有功能都可以直接使用。
 * ***************************************************************************************
 * ConcurrentHashMap集合特点:
 * 底层是哈希表结构
 * 此集合是线程安全的，但是某些功能不必锁定。比如get()
 * 不会抛出ConcurrentModificationException并发修改异常 此集合支持遍历过程中添加，删除元素。
 * ***************************************************************************************
 * ConcurrentHashMap集合的锁定特点:
 * 为了提高效率，不会将整个集合全部锁定。
 * 当添加或者移除元素时，是对链表进行操作，链表存储在数组中，那么就只会针对这个链表进行锁定。
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            for (int i = 0; i < 100; i++) {
                concurrentHashMap.put(i, i);
            }
        });
        executorService.submit(() -> {
            for (int i = 100; i < 200; i++) {
                concurrentHashMap.put(i, i);
            }
        });
        executorService.submit(() -> {
            for (int i = 200; i < 300; i++) {
                concurrentHashMap.put(i, i);
            }
        });

        System.out.println(concurrentHashMap);
    }
}
