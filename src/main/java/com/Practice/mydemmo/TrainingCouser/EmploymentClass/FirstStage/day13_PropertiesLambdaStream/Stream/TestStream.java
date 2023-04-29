package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * java.util.stream.Stream<T> 是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
 * 获取一个流有以下几种常用的方式：
 * 1.所有的 Collection 集合都可以通过 stream 默认方法获取流；
 * 2.Stream 接口的静态方法 of 可以获取数组对应的流
 * 3.Arrays.stream(),对象数组和 of 返回相同类型 stream ,基本类型数组返回不同stream类型
 */
public class TestStream {
    /**
     * Collection 集合获取 stream
     */
    @Test
    public void test1() {
        List<String> str = new ArrayList<>();
        Stream<String> stream = str.stream();
    }

    /**
     * 数组获取流
     * 1.对象数组 对于对象数组，Arrays.stream 和 Stream.of 都返回相同的输出。
     * 2.基本数组 对于基本数组，Arrays.stream 和 Stream.of 将返回不同的输出。
     */
    @Test
    public void test2() {
        int arr1[] = {1, 3, 4, 6, 8, 9};
        int arr2[] = {1, 3, 2, 5, 6, 8};

        IntStream stream1 = Arrays.stream(arr1);
        Stream<int[]> stream2 = (Stream<int[]>) Stream.of(arr2);
    }

    /**
     * 数组获取流
     * 1.对象数组 对于对象数组，Arrays.stream 和 Stream.of 都返回相同的输出。
     * 2.基本数组 对于基本数组，Arrays.stream 和 Stream.of 将返回不同的输出。
     */
    @Test
    public void test3() {
        Object obj1[] = {};
        Object obj2[] = {};

        Stream<Object> stream1 = Arrays.stream(obj1);
        Stream<Object> stream2 = Stream.of(obj2);
    }
}
