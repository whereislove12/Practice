package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Lambda的格式
 * 标准格式:
 * Lambda省去面向对象的条条框框，格式由3个部分组成：
 * 一些参数
 * 一个箭头
 * 一段代码
 * *******************************************************************************************************************
 * Lambda表达式的标准格式为：
 * (参数类型 参数名称) -> { 代码语句 }
 * 格式说明：
 * 小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
 * -> 是新引入的语法格式，代表指向动作。
 * 大括号内的语法与传统方法体要求基本一致。
 * *******************************************************************************************************************
 * 省略格式:
 * 省略规则 在Lambda标准格式的基础上，使用省略写法的规则为：
 * 1. 小括号内参数的类型可以省略； 2. 如果小括号内有且仅有一个参数，则小括号可以省略；
 * 3. 如果大括号内有且仅有一个语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
 * *******************************************************************************************************************
 * Lambda的前提条件:
 * 1. 使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。 无论是JDK内置的 Runnable 、Comparator 接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
 * 2. 使用Lambda必须具有接口作为方法参数。 也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。
 * *******************************************************************************************************************
 * 函数式接口在Java中是指：有且仅有一个抽象方法的接口。
 * 格式:
 * 修饰符 interface 接口名称 {
 * public abstract 返回值类型 方法名称(可选参数信息); // 其他非抽象方法内容
 * }
 * *******************************************************************************************************************
 * @FunctionalInterface 。该注解可用 于一个接口的定义上：
 * 一旦使用该注解来定义接口，编译器将会强制检查该接口是否确实有且仅有一个抽象方法，否则将会报错。
 */
public class LambdaDemo {
    @Test
    public void test1() {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                map.put(i, i * 10);
            }
        }).start();
        new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                map.put(i, i * 10);
            }
        }).start();
        new Thread(() -> {
            for (int i = 200; i < 300; i++) {
                map.put(i, i * 10);
            }
        }).start();
        System.out.println(map);
    }

    @Test
    public void test2() {
        Person person1 = new Person("小王", 18);
        Person person2 = new Person("小李", 38);
        Person person3 = new Person("老刘", 13);
        Person person4 = new Person("老张", 17);
        Person person5 = new Person("小芳", 19);

        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);

        Collections.sort(personArrayList, (o1, o2) ->
                o2.getAge() - o1.getAge()
        );
        System.out.println(personArrayList);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private class Person {
        private String name;
        private Integer age;
    }
}
