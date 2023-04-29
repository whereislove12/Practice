package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day8_Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * Map 中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。
 */
public class MapDemo {

    @Test
    public void test1() {
        Map<Integer, Dog> dogs = this.initDogs();
        dogs.remove(1);
        System.out.println(dogs);
    }

    /**
     * 获取 map 的 key 集合,然后遍历
     */
    @Test
    public void test2() {
        Map<Integer, Dog> dogs = this.initDogs();
        Set keySet = dogs.keySet();
        for (Object o : keySet) {
            System.out.println(dogs.get(o));
        }
    }

    /**
     * 获取 map 的 value 集合,然后遍历
     */
    @Test
    public void test3() {
        Map<Integer, Dog> dogs = this.initDogs();
        Collection values = dogs.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }

    /**
     * 获取键值对的集合,然后遍历
     */
    @Test
    public void test4() {
        Map<Integer, Dog> dogs = this.initDogs();
        Set<Map.Entry<Integer, Dog>> entrySet = dogs.entrySet();
        for (Map.Entry<Integer, Dog> dogEntry : entrySet) {
            System.out.println(dogEntry.getKey() + "-" + dogEntry.getValue());
        }
    }

    /**
     * 计算一个字符串中每个字符出现次数。
     */
    @Test
    public void countNumTest() {
        Map<String, Integer> hashMap = countNum("kj1b3h21brfh34q2rhuioh12o43h23iu5rb2i3bn2ihn4oi123h4oi");
        System.out.println(hashMap);
    }

    private static Map<String, Integer> countNum(String str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strings = str.split("/*");

        for (String string : strings) {
            Integer value = hashMap.get(string);

            if (Objects.isNull(value)) {
                hashMap.put(string, 1);
            } else {
                hashMap.put(string, value + 1);
            }
        }
        return hashMap;
    }

    public Map<Integer, Dog> initDogs() {
        Map<Integer, Dog> dogHashMap = new HashMap<>();
        dogHashMap.put(1, new Dog("小白", 3));
        dogHashMap.put(2, new Dog("小花", 4));
        dogHashMap.put(3, new Dog("小芳", 3));
        return dogHashMap;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class Dog {
        private String name;
        private Integer age;
    }
}
