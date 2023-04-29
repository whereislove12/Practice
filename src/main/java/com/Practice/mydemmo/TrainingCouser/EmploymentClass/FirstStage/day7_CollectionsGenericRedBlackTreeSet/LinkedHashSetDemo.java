package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 此链接列表定义了迭代顺序，即按照将元素插入到 set 中的顺序（插入顺序）进行迭 代。
 */
public class LinkedHashSetDemo {
    @Test
    public void test1(){
        Set set =  new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}
