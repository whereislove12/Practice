package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * java.util.Set 接口和 java.util.List 接口一样，同样继承自 Collection 接口，
 * 它与 Collection 接口中的 方法基本一致，并没有对 Collection 接口进行功能上的扩充，
 * 只是比 Collection 接口更加严格了。与 List 接口不同的是， Set 接口下的集合不存储重复的元素。
 */
public class SetDemo {
    @Test
    public void test1() {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("world");
        System.out.println(set);
    }
}
