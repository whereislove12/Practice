package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Enum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 枚举是JDK1.5新增的引用数据类型，和类，接口是一个级别的，定义枚举的关键字为 enum。
 * java.lang.Enum 类，是所有枚举的父类。
 * 枚举的本质就是一个类的多个对象。
 * **************************************************************************************************************
 * 枚举的定义
 * - 格式：public enmu 枚举名{}
 * - 枚举常量定义：
 * - 枚举中的常量名字大写，多个常量之间逗号分开，最后一个常量可以写分号，也可以不写。每一个常量，都表示这个类的对象。修饰符为 public static final。
 * - 枚举中有默认的无参数的private修饰的构造方法，如果手写构造方法，也必须是私有修饰的。而且构造方法必须写在常量的后面，这时最后一个常量就必须要写分号。
 */
public class EnumIntroduce {
    /**
     * 颜色枚举示例
     */
    public enum MyEnum1 {
        RED, BLUE, YELLOW
    }

    @Getter
    @AllArgsConstructor
    public enum MyEnum2 {
        RED("红色"),
        YELLOW("男儿本色"),
        BLUE("蓝色");

        private String color;
    }
}
