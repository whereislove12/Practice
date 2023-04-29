package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day8_Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 在HashMap下面有一个子类LinkedHashMap，底层是哈希表双向链表，保证迭代的顺序
 */
public class LinkedHashMapDemo {
    @Test
    public void test1() {
        Map<Integer, Dog> dogMap = this.initDogs();
        Set<Map.Entry<Integer, Dog>> entrySet = dogMap.entrySet();
        for (Map.Entry<Integer, Dog> dogEntry : entrySet) {
            System.out.println(dogEntry.getKey() + "-" + dogEntry.getValue());
        }
    }

    public Map<Integer, LinkedHashMapDemo.Dog> initDogs() {
        Map<Integer, LinkedHashMapDemo.Dog> dogHashMap = new LinkedHashMap<>();
        dogHashMap.put(1, new LinkedHashMapDemo.Dog("小白", 3));
        dogHashMap.put(2, new LinkedHashMapDemo.Dog("小花", 4));
        dogHashMap.put(3, new LinkedHashMapDemo.Dog("小芳", 3));
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
