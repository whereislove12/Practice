package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Test，用于修饰需要执行的测试方法
 * @Before，修饰的方法会在测试方法之前被自动执行
 * @After，修饰的方法会在测试方法执行之后自动被执行
 */
public class JunitDemo {
    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test() {
        System.out.println("test");
    }
}
