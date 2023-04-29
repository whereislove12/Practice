package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 泛型通配符
 * 当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示
 * 但是一旦使用泛型的通配符后，只 能使用Object类中的共性方法，集合中元素自身方法无法使用
 * 泛型不存在继承关系
 * -----------------------------------------------
 * 通配符高级使用----受限泛型 之前设置泛型的时候，实际上是可以任意设置的，只要是类就可以设置。但是在JAVA的泛型中可以指定一个泛型的上 限和下限。
 * 泛型的上限：
 * 格式： 类型名称 <? extends 类 > 对象名称 意义： 只能接收该类型及其子类
 * 泛型的下限：
 * 格式： 类型名称 <? super 类 > 对象名称
 * 意义： 只能接收该类型及其父类型
 */
public class GenericWildcard {
    @Test
    public void test1() {
        int arr[] = {1, 3, 5, 7, 9};
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        printObjArrayList((ArrayList<?>) integerList);
    }

    /**
     * 方法参数中的？代表可以接收任意类型
     */
    public static void printObjArrayList(ArrayList<?> arrayList) {
        System.out.println(arrayList);
    }
}
