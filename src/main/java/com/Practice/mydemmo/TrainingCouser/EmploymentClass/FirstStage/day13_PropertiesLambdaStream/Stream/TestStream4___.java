package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 方法引用
 * 方法引用符:
 * 符号表示 : '::'
 * 符号说明 : 双冒号为方法引用运算符，而它所在的表达式被称为方法引用
 * 应用场景 : 如果Lambda要表达的函数方案 , 已经存在于某个方法的实现中，那么则可以使用方法引用。
 * 推导与省略 : 如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式——它们 都将被自动推导。
 * 而如果使用方法引用，也是同样可以根据上下文进行推导。函数式接口是Lambda的基础，而方法引用是Lambda的简化形式。
 * ******************************************************************************************************************
 * 扩展的引用方式:
 * 1.对象名--引用成员方法 :如果一个类中已经存在了一个成员方法，则可以通过对象名引用成员方法
 * 2.类名--引用静态方法
 * 3.类--构造引用
 * 4.数组--构造引用
 */
public class TestStream4___ {
    @Test
    public void test1() {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        Stream<String> stream1 = one.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> stream2 = two.stream().filter(s -> s.startsWith("张")).skip(2);
        //方法引用输出
        Stream.concat(stream1, stream2).collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("小红", 18));
        peopleList.add(new People("小王", 19));
        peopleList.add(new People("小钢弹", 17));
        peopleList.add(new People("小不拉几", 12));
        peopleList.add(new People("大大大", 10));

        peopleList.stream().filter(Objects::nonNull).filter(people -> people.getAge() > 15).forEach(p -> System.out.println(p.getName()));
    }

    /**
     * 对象名--引用成员方法
     */
    @Test
    public void test3() {
        String str = "hello";
        printUP(str::toUpperCase);
    }

    /**
     * 类名--引用静态方法
     * Lambda表达式： n -> Math.abs(n)
     * 方法引用： Math::abs
     */
    @Test
    public void test4() {
        printRanNum(Math::random);
    }

    /**
     * 类--构造引用
     * Lambda表达式： name -> new Person(name)
     * 方法引用： Person::new
     */
    @Test
    public void test5() {
        People people = createPeople(People::new, "哈哈哈啦啦啦");
        System.out.println(people);
    }

    /**
     * 数组--构造引用
     * Lambda表达式： length -> new int[length]
     * 方法引用： int[]::new
     */
    @Test
    public void test6() {
        int[] array = createArray(int[]::new, 10);
    }

    public static void printUP(Supplier<String> sup) {
        String apply = sup.get();
        System.out.println(apply);
    }

    public static void printRanNum(Supplier<Double> sup) {
        Double apply = sup.get();
        System.out.println(apply);
    }

    public static People createPeople(Function<String, People> fun, String name) {
        People apply = fun.apply(name);
        return apply;
    }

    public static int[] createArray(Function<Integer, int[]> fun, int n) {
        int[] p = fun.apply(n);
        return p;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class People {
        private String name;
        private Integer age;

        public People(String name) {
            this.name = name;
        }
    }
}
