package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day7_CollectionsGenericRedBlackTreeSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * 泛型的好处:
 * 1.避免强制类型转换的麻烦
 * 2.将运行时异常,提前到了编译时期,降低了程序员的工作量
 * 3.一旦指定泛型,数据类型将被统一
 * 4.实现代码的模板化,把数据类型当做参数传递
 * -----------------------------------------------------------------------------------------
 * 定义和使用含有泛型的类
 * 定义格式：
 * 修饰符 class 类名<代表泛型的变量> { }
 * -----------------------------------------------------------------------------------------
 * 含有泛型的方法
 * 定义格式：
 * 修饰符 <代表泛型的变量> 返回值类型 方法名(参数){ }
 * -----------------------------------------------------------------------------------------
 * 含有泛型的接口
 * 定义格式：
 * 修饰符 interface接口名<代表泛型的变量> { }
 */
public class GenericDemo {
    @Test
    public void test1() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            nums.add(i);
        }
    }

    /**
     * 泛型类
     * @param <T>
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    class people<T> {
        private T t;
    }

    @Test
    public void test2(){
        people<String> people = new people<>();
        people.setT("小调皮");
        System.out.println(people);
    }

    @Test
    public void test3(){
        getString("awdadaw");
    }

    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public static <T>void getString(T t){
        System.out.println(t);
    }
}