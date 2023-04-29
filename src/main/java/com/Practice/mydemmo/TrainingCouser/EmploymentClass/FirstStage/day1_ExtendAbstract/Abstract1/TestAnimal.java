package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract1;

import org.junit.jupiter.api.Test;

public class TestAnimal {
    @Test
    public void test1() {
        Animal dog = new Dog();
        dog.setName("旺财");
        dog.setAge(3);
        dog.eat();
        dog.shout();
        dog.sleep();
    }

    @Test
    public void test2() {
        Animal cat = new Cat();
        cat.setName("小花");
        cat.setAge(5);
        cat.eat();
        cat.shout();
        cat.sleep();
    }
}
