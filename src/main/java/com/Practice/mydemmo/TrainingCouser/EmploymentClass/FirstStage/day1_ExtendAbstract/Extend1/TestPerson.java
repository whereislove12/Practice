package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend1;

import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    public void personTest() {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(28);

        person1.selfIntroduction();
        person1.eat("豪华套餐");
        person1.sleep();
    }

    /**
     * 匿名对象
     */
    @Test
    public void testPerson2() {
        new Person("小红", 18).eat("老北京炸酱意大利面");
    }
}
