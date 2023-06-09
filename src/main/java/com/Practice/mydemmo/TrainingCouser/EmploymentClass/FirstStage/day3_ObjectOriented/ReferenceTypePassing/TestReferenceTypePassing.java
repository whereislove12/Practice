package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day3_ObjectOriented.ReferenceTypePassing;

import org.junit.jupiter.api.Test;
/**
 * 类名作为方法的形参
 * 方法的形参是类名，其实需要的是该类的对象
 * 实际传递的是该对象的【地址值】
 * 类名作为方法的返回值
 * 方法的返回值是类名，其实返回的是该类的对象
 * 实际传递的，也是该对象的【地址值】
 *------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 抽象类作为形参和返回值
 * 方法的形参是抽象类名，其实需要的是该抽象类的子类对象
 * 方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 接口作为形参和返回值
 * 方法的形参是接口名，其实需要的是该接口的实现类对象
 * 方法的返回值是接口名，其实返回的是该接口的实现类对象
 */
public class TestReferenceTypePassing {
    @Test
    public void test1(){
        eat(new Person());
    }

    public void eat(Person person){
        person.eat();
    }
}
