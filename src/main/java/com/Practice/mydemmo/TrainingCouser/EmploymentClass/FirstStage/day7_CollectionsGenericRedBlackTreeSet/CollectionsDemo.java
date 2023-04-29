package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java.util.Collections 此类完全由在 collection 上进行操作或返回 collection 的静态方法组成。
 * public static void shuffle(List<?> list) ：打乱集合顺序。
 * public static <T> void sort(List<T> list) ：将集合中元素按照默认规则排序。
 * public static <T> void sort(List<T> list，Comparator<? super T> ) ：将集合中元素按照指定规则排序。
 */
public class CollectionsDemo {
    @Test
    public void test1() {
        int[] nums = {2, 1, 4, 5, 3, 8, 7, 6};
        //基本数据类型用stream流操作需要装箱
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Collections.sort(numList);
        System.out.println(numList);
    }

    @Test
    public void test2() {
        Student a = new Student("张三", 18);
        Student b = new Student("李四", 15);
        Student c = new Student("王五", 25);
        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        Collections.sort(students, (Student A, Student B) -> A.getAge() - B.getAge());
        System.out.println(students);
    }

    @Test
    public void test3(){
        int[] nums = {1,2,3,4,5,6,7,8};
        //基本数据类型用stream流操作需要装箱
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Collections.shuffle(numList);
        System.out.println(numList);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    class Student {
        private String name;
        private Integer age;
    }
}
