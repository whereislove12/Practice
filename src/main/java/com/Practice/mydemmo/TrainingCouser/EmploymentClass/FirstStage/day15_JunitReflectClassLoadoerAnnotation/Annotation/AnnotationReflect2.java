package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation;

/**
 * 使用注解:
 * 1.示例:成员方法上使用Book注解
 * public class bookShelf {
 *
 * @Book(name = "英语书",authors = {"张老师","李老师"})
 * public void getEnglishBook(){}
 * }
 * 2.注意事项:
 * - 如果属性有默认值，则使用注解的时候，这个属性可以不用赋值。
 * - 如果属性没有默认值，那么在使用注解时一定要给属性赋值。
 * ***************************************************************************************************************
 * 特殊属性value:
 * 1.当注解中只有一个属性且名称是value，在使用注解时给value属性赋值可以直接给属性值，无论value是单值元素还是数组类型。
 * 2.如果注解中除了value属性还有其他属性，且至少有一个属性没有默认值，则在使用注解给属性赋值时，value属性名不能省略
 * ***************************************************************************************************************
 * 元注解:
 * 元注解之@Target:
 * 作用：指明此注解用在哪个位置，如果不写默认是任何地方都可以使用。
 * - 可选的参数值在枚举类 ElemenetType 中包括：
 * TYPE： 用在类,接口上
 * FIELD：用在成员变量上
 * METHOD： 用在方法上
 * PARAMETER：用在参数上
 * CONSTRUCTOR：用在构造方法上
 * LOCAL_VARIABLE：用在局部变量上
 * 元注解之@Retention:
 * 作用：定义该注解的生命周期(有效范围)。
 * - 可选的参数值在枚举类型RetentionPolicy中包括:
 * SOURCE：注解只存在于Java源代码中，编译生成的字节码文件中就不存在了。
 * CLASS：注解存在于Java源代码、编译以后的字节码文件中，运行的时候内存中没有，默认值。
 * RUNTIME：注解存在于Java源代码中、编译以后的字节码文件中、运行时内存中，程序可以通过反射获取该注解。
 * ***************************************************************************************************************
 * 注解解析:
 * 与注解解析相关的接口:
 * 1.Annotated：所有注解类型的公共接口，类似所有类的父类是Object。
 * 2.AnnotatedElement：定义了与注解解析相关的方法，常用方法以下四个：
 * (1).boolean isAnnotationPresent(Class annotationClass); 判断当前对象是否有指定的注解，有则返回true，否则返回false。
 * (2).T getAnnotation(Class<T> annotationClass);  获得当前对象上指定的注解对象。
 * (3).Annotation[] getAnnotations(); 获得当前对象及其从父类上继承的所有的注解对象。
 * (4).Annotation[] getDeclaredAnnotations();获得当前对象上所有的注解对象，不包括父类的。
 */
public class AnnotationReflect2 {

}