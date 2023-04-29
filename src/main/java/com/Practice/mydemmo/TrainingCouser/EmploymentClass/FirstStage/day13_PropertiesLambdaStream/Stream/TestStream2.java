package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream常用方法:
 * 终结方法:
 * count        统计个数
 * forEach      逐个处理
 * 函数拼接方法:
 * filter       过滤
 * limit        限制个数
 * skip         跳过
 * concat       包含
 */
public class TestStream2 {
    @Test
    public void testCount() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        long count = Arrays.stream(arr).count();
        System.out.println(count);
    }

    @Test
    public void testForEach() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(arr).forEach(num -> System.out.println(num));
    }

    @Test
    public void testFilter1() {
        List<People> people = new ArrayList<>();
        people.add(new People("小张", 23));
        people.add(new People("小王", 24));
        people.add(new People("小李", 27));
        people.add(new People("小刘", 28));
        people.add(new People());
        people.add(null);
        List<People> collect = people.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testFilter2() {
        List<People> people = new ArrayList<>();
        people.add(new People("小张", 23));
        people.add(new People("小王", 24));
        people.add(new People("小李", 27));
        people.add(new People("小刘", 28));
        people.add(null);
        List<People> collect = people.stream().filter(Objects::nonNull).filter((people1 ->
                people1.getAge() < 28
        )).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testLimit() {
        List<People> people = new ArrayList<>();
        people.add(new People("小张", 23));
        people.add(new People("小王", 24));
        people.add(new People("小李", 27));
        people.add(new People("小刘", 28));
        people.add(new People("小赵", 28));
        people.add(new People("小孙", 21));
        people.add(new People("小杨", 29));

        List<People> collect = people.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testSkip() {
        List<People> people = new ArrayList<>();
        people.add(new People("小张", 23));
        people.add(new People("小王", 24));
        people.add(new People("小李", 27));
        people.add(new People("小刘", 28));
        people.add(new People("小赵", 28));
        people.add(new People("小孙", 21));
        people.add(new People("小杨", 29));

        List<People> collect = people.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * concat 是将两个stream流组合成一个
     */
    @Test
    public void testConcat() {
        List<People> people1 = new ArrayList<>();
        people1.add(new People("小张", 23));
        people1.add(new People("小王", 24));
        people1.add(new People("老李", 27));
        people1.add(new People("老刘", 28));
        List<People> people2 = new ArrayList<>();
        people2.add(new People("老赵", 28));
        people2.add(new People("小孙", 21));
        people2.add(new People("老杨", 29));

        List<People> collect = Stream.concat(people1.stream(), people2.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class People {
        private String name;
        private Integer age;
    }
}
