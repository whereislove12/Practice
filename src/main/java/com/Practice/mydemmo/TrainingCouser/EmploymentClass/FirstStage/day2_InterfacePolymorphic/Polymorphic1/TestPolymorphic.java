package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic1;


import org.junit.jupiter.api.Test;

/**
 * 多态
 *
 * 好处:
 * 接口参数定义为父类,方便扩展
 *
 * 子类使用自己独有的方法时,必须强制转换为子类自己 ((Dog) dog).watchDoor();
 *
 * 向上转型：
 * 多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的。
 * 当父类引用指向一个子类对象时，便是向上转型。
 *
 * 向下转型：
 * 父类类型向子类类型向下转换的过程，这个过程是强制的。
 * 一个已经向上转型的子类对象，将父类引用转为子类引用，可以使用强制类型转换的格式，便是向下转型。
 */
public class TestPolymorphic {
    @Test
    public void test1() {
        Animal dog = new Dog();
        dog.setName("小白");
        dog.setAge(5);
        dog.eat();
        dog.shout();
        dog.sleep();
        ((Dog) dog).watchDoor();
    }

    @Test
    public void test2() {
        Animal cat = new Cat();
        cat.setName("小黑");
        cat.setAge(5);
        cat.eat();
        cat.shout();
        cat.sleep();
        ((Cat) cat).catchMouse();
    }
}
