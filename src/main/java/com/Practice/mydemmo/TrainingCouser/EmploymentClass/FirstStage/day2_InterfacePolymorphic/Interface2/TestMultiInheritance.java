package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2.Interface.Animal;
import org.junit.jupiter.api.Test;

/**
 * 测试多实现
 * <p>
 * 抽象类可以实现接口但是不重写接口中的方法
 */
public class TestMultiInheritance {
    @Test
    public void test1() {
        Animal dog = new Dog();
        dog.setName("小黄");
        dog.setAge(5);
        dog.eat();
        dog.run();
        dog.sleep();
    }

    @Test
    public void test2() {
        Animal cat = new Cat();
        cat.setName("小花");
        cat.setAge(3);
        cat.eat();
        cat.run();
        cat.sleep();
    }
}
