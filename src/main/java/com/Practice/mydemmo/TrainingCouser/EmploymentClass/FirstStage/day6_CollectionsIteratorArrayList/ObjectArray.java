package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day6_CollectionsIteratorArrayList;

import org.junit.jupiter.api.Test;

/**
 * 对象数组
 * 数组是容器，即可以存储基本数据类型也可以存储引用数据类，存储了引用数据类型的数组称为对象数组
 * 数组的弊端 :
 * 1.数组长度是固定的，一旦创建不可修改。
 * 2.需要添加元素，只能创建新的数组，将原数组中的元素进行复制
 */
public class ObjectArray {
    @Test
    public void test1() {
        People peoples[] = {
                new People("张三", 18),
                new People("李四", 18),
                new People("王五", 18)
        };
        for (People people : peoples) {
            System.out.println(people);
        }
    }
}
