package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * HashSet底层数据结构是单向哈希表。
 * 不保证元素的迭代顺序，存储元素的顺序和取出元素的顺序不一致
 * 此集合不允许存储重复元素。
 * 存储在此集合中的元素应该重写hashCode()和equals()方法保证唯一性。
 * 此集合具有数组，链表，红黑树三种结构特点。
 * 线程不安全，运行速度快。
 */
public class HashSetDemo {
    @Test
    public void test1() {
        Student student = new Student("王钢蛋", 18);
        Set<Student> students = new HashSet<>();
        students.add(student);
        System.out.println(students);
    }

    class Student {
        private String name;
        private Integer age;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student student)) return false;
            return Objects.equals(getName(), student.getName()) && Objects.equals(getAge(), student.getAge());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Student() {
        }

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
