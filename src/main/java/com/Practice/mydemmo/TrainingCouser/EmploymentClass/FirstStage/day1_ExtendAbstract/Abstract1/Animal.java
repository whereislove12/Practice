package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象类的使用:
 * (1)抽象方法不能直接new对象
 * (2)必须定义一个子类继承抽象类
 * (3)子类必须覆盖重写抽象类中的所有抽象方法去掉abstract关键字,加上{}
 * (4)创建子类对象
 * (5)通过子类对象调用方法
 *
 * 抽象类的注意事项:
 * 1.抽象类不能创建对象，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象
 * 2.抽象类中，必须有构造方法，是供子类创建对象时，初始化父类成员使用的
 * 3.抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类
 * 4.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public abstract void shout();

    public void sleep() {
        System.out.println("休眠");
    }
}
