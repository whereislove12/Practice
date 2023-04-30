### xml的作用

- 存放数据

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persons>
	<person id="p001">
		<name>张三</name>
	</person>
	<person id="p002">
		<name>李四</name>
	</person>
</persons>
```

类似于Java代码：

```java
class Person{
	String id;
	String name;
}

public void test(){
	HashSet<Person> persons = new HashSet<Person>();
	persons.add( new Person("p001","张三") );
	persons.add( new Person("p002","李四") );
}
```

- 配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans>
	<bean className="com.itheima.bean.User">
		<property name="username" value="jack"></property>
	</bean>
</beans>
```

类似于java代码:

```java
class Bean{
	private String username;
	private String pws;
	//补全set\get方法
}
```

```java
public static void main(String[] args){
    Class clzzz = Class.forName("com.itheima.bean.User");
    Object obj = clazz.newInstance();
    Method method = clazz.getMethod("setUsername",String.class);
    method.invoke(obj,"jack");
}
```

