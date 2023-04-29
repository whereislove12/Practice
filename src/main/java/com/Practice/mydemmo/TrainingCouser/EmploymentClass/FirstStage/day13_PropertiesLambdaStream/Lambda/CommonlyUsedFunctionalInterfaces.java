package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 常用的函数式接口:
 * java.util.function.Supplier<T> 接口，它意味着"供给" , 对应的Lambda表达式需要“对外提供”一个符合泛型类型的对 象数据。
 * 抽象方法 : get 仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对象数据。
 * ***************************************************************************************************************
 * java.util.function.Consumer<T> 接口则正好相反，它不是生产一个数据，而是消费一个数据，其数据类型由泛型参数 决定。
 * 抽象方法：accept
 * Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据
 * ***************************************************************************************************************
 * java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称 为后置条件。有进有出，所以称为“函数Function”。
 * 抽象方法：apply
 * Function 接口中最主要的抽象方法为： R apply(T t) ，根据类型T的参数获取类型R的结果
 * ***************************************************************************************************************
 * 有时候我们需要对某种类型的数据进行判断，从而得到一个boolean值结果。这时可以使用 java.util.function.Predicate<T> 接口。
 * 抽象方法：test
 * Predicate 接口中包含一个抽象方法： boolean test(T t) 。
 */
public class CommonlyUsedFunctionalInterfaces {
    @Test
    public void testSupplier() {
        int arr[] = {1, 3, 4, 2, 5, 8, 6, 7, 9, 10};

        printMaxNum(() -> {
            int max = arr[0];
            for (int num : arr) {
                if (max < num) {
                    max = num;
                }
            }
            return max;
        });
    }

    @Test
    public void testConsumer() {
        String str = "hello";
        //标准格式
        fun(str, (String s) -> {
            System.out.println(s.toUpperCase());
        });
        //简化格式
        fun(str, s -> {
            System.out.println(s.toUpperCase());
        });
    }

    @Test
    public void testFunction() {
        transStringToInteger(s ->
                        Integer.parseInt(s)
                , "1000");
    }

    @Test
    public void testPredicate() {
        estimate(s -> s.length() > 5
                , "ervwewdfwefw");
    }

    private static void estimate(Predicate<String> predicate, String str) {

        System.out.println("字符串特别长吗:" + predicate.test(str));
    }

    private static void transStringToInteger(Function<String, Integer> function, String str) {
        System.out.println(function.apply(str));
    }

    private static void fun(String string, Consumer<String> consumer) {
        consumer.accept(string);
    }

    private static void printMaxNum(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }
}
