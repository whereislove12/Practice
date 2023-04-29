package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day6_CollectionsIteratorArrayList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List接口
 * 特点:
 * List集合是有序的集合，存储和取出的顺序一致。 List集合允许存储重复的元素。
 * List集合中的每个元素具有索引。
 * 特有方法:
 * public void add(int index,E element) 在列表的指定位置上插入元素。
 * public E get(int index) 返回列表中指定位置的元素。
 * public E set(int index,E element) 用指定元素替换列表中指定位置的元素，并返回替换前的元素。
 * public E remove(int index) 移除列表中指定位置的元素，并返回被移除之前的元素
 */
public class ListDemo {
    /**
     * ArrayList 底层是数组,查找快,增删慢
     */
    @Test
    public void test1() {
        //新创建 ArrayList 时,默认为空数组
        List list = new ArrayList();

        //未指定容量,默认容量为10
        list.add(10);

    }

    /**
     * LinkedList 底层是链表,增删快,查找慢
     * LinkedList 双向链表
     * 常用方法:
     * public void addFirst(E e) :将指定元素插入此列表的开头。
     * public void addLast(E e) :将指定元素添加到此列表的结尾。
     * public E getFirst() :返回此列表的第一个元素。
     * public E getLast() :返回此列表的最后一个元素。
     * public E removeFirst() :移除并返回此列表的第一个元素。
     * public E removeLast() :移除并返回此列表的最后一个元素。
     * public E pop() :从此列表所表示的堆栈处弹出一个元素。
     * public void push(E e) :将元素推入此列表所表示的堆栈。
     * public boolean isEmpty() ：如果列表不包含元素，则返回true。
     */
    @Test
    public void test2() {
        List list = new LinkedList();

        list.add(20);

        Object o = list.get(0);
    }
}
