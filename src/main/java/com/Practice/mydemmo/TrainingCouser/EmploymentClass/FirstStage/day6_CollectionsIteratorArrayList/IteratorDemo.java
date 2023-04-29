package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day6_CollectionsIteratorArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器
 */
public class IteratorDemo {
    @Test
    public void test1() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 使用迭代器迭代遍历时,不要使用 集合 本身的 remove 方法,否则会有并发修改异常
     * 使用迭代器的 remove 方法则不会发生异常
     */
    @Test
    public void test2() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("3")) {
                //strings.remove(next);
                iterator.remove();
            }
        }
        System.out.println(strings);
    }
}
