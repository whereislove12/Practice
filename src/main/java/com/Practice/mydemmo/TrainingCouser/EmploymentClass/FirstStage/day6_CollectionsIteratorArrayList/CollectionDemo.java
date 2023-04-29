package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day6_CollectionsIteratorArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作 所有的单列集合。
 * 方法如下：
 * public boolean add(E e) ： 把给定的对象添加到当前集合中 。
 * public boolean addAll(Collection<? extends E>) 将另一个集合元素添加到当前集合中。
 * public void clear() :清空集合中所有的元素。
 * public boolean remove(E e) : 把给定的对象在当前集合中删除。
 * public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty() : 判断当前集合是否为空。
 * public int size() : 返回集合中元素的个数。
 * public Object[] toArray() : 把集合中的元素，存储到数组中。
 */
public class CollectionDemo {
    @Test
    public void test1() {
        List<String> strings1 = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();

        strings1.add("hello");

        strings2.add("world");
        strings2.add("!");

        strings1.addAll(strings2);

        for (String s : strings1) {
            System.out.print(s + " ");
        }
    }

    @Test
    public void test2(){
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("!");

        System.out.println(strings.contains("!"));

        strings.remove("world");

        System.out.println(Arrays.toString(strings.toArray()));

        System.out.println(strings.isEmpty());
    }
}
