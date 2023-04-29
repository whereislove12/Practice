package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day3_ObjectOriented.StaticKeyword;

import org.junit.jupiter.api.Test;

/**
 * static是静态修饰符，一般修饰成员。
 * 被static修饰的成员属于类，不属于单个这个类的某个对象。
 * static修饰的成员被多个对 象共享。
 * static修饰的成员属于类，但是会影响每一个对象。
 * 被static修饰的成员又叫类成员，不叫对象的成员。
 *
 * 特点 :
 * 1. 被static修饰的属于类,不属于对象
 * 2. 优先于对象存在
 * 3. static修饰的成员,可以作为共享的数据(只要是根据static修饰的成员所在的类创建出来的对象,都可以共享这个数据)
 *
 * 静态方法 :
 * 当 static 修饰成员方法时，该方法称为类方法 。
 * 静态方法在声明中有 static ，建议使用类名来调用，而不需要创建类 的对象。
 * 类方法：使用 static关键字修饰的成员方法，习惯称为静态方法。
 */
public class TestStatic {
    @Test
    public void test1(){
        StaticDemo1.str = "你好";

        System.out.println(StaticDemo1.str);

        StaticDemo1.printHello();
    }
}
