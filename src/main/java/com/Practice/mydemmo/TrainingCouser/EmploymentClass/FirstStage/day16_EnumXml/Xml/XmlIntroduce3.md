### 什么是DTD约束：

DTD(Document Type Definition)文档类型定义，用来约束xml文档。规定xml文档中元素的名称，子元素的名称及顺序，元素的属性等等。

DTD语法：
文档声明：
1.内部DTD，在xml文档内部嵌入DTD，只对当前xml有效。

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<!DOCTYPE web-app[
    <!-- ......具体语法  -->
]>
<web-app>
</web-app>
```

2.外部DTD(本地DTD)，DTD在本地文件系统，内部自己项目使用。

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE web-app SYSTEM "web-app_....">
<!-- SYSTEM "DTD约束文件所在路径"-->
<web-app>
</web-app>
```

3.外部DTD(网络)

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE web-app PUBLIC "dtd的名称"
 "dtd文件的路径">
<web-app>
</web-app>
```

快速入门：

1、创建一个以.dtd为文件后缀名的文件。

2、步骤：

- 看xml中有多少元素，有多少元素就 写几个<!ELEMENT>

- 判断元素是简单元素还是复杂元素。

```
 1.简单元素：没有子元素的元素。<!ELEMENT 元素名称 (子元素)>

 2.复杂元素：拥有子元素的元素。<!ELEMENT 元素名称 (#PCDATA)>
```

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE person SYSTEM "person.dtd">
<!-- 
<!DOCTYPE person SYSTEM "person.dtd">//引入系统中的dtd文件
<!ELEMENT person (name,age,sex)>//person是一个复杂元素 （子元素列表）
<!ELEMENT name (#PCDATA)> //#PCDATA表示一个字符串，把元素约束成字符串类型
<!ELEMENT age (#PCDATA)>
<!ELEMENT sex (#PCDATA)>
 -->
<person>
	<name>张三</name>
	<age>19</age>
	<sex>女</sex>
</person>
```

3、关于使用dtd定义元素：

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE person[
<!-- 复杂元素 -->
<!--
<!ELEMENT person (name,age,sex)>：子元素只能出现一次
表示子元素可以出现的次数：
+:表示只能出现一次或者多次
?:表示零次或者一次
*:表示出现任意次
<!ELEMENT person (name+,age?,sex*)>
子元素列表以逗号隔开,表示出现的顺序
子元素用|隔开，表示只能出现一个
-->
<!ELEMENT person (name+,age?,sex*,census)>
<!--//简单元素-->
<!ELEMENT name (#PCDATA)><!--//(#PCDATA)表示name是字符串类型-->
<!ELEMENT age EMPTY><!--//EMPTY表示age约束为空,不能有值-->
<!ELEMENT sex ANY><!--//ANY表示任意,可有值,可无值-->
<!ELEMENT census (side|country)>
<!ELEMENT side (#PCDATA)>
<!ELEMENT country (#PCDATA)>
]>
 
 
<person>
	<name>张三</name>
	<name>李四</name>
	<age></age>
	<sex>女</sex>
	<sex>女</sex>
	<sex>女</sex>
	<census>
		<side>地球村</side>
		<!-- <country>银河系</country> //side和country只能出现一个 -->
	</census>
</person>
```

使用DTD定义属性：

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE person[
<!ELEMENT person (student*)>
<!ELEMENT student (#PCDATA)>
<!--<!ATTLIST 元素名称 
		属性名称 属性类型 约束条件>-->
<!--
	属性类型：
		CDATA：字符串类型
		枚举类型：(XX|XX|XX)只能在一定的范围内出现值,而且值只能出现一次
		ID:只能以字母或下划线开头
	约束条件：
		#REQUIRED:属性必须存在
		#IMPLIED：属性可有可无
		#FIXED：表示一个固定值 #FIXED "ABC"//没有#FIXED就表示默认值
-->
<!ATTLIST student
	name CDATA #REQUIRED
	age ID #IMPLIED
	sex (男|女) "男"
	galaxy CDATA #FIXED "地球"
	>
]>
 
 
<person>
	<student name="张三" age="ten" galaxy="地球"></student>
	<!-- 
		name: 字符串类型  是必须出现的 
		age: ID类型  age属性可有可无
		sex: 枚举类型 默认值是男
		galaxy: 字符串类型  固定值就是"地球"
	-->
</person>
```

实体：

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE person[
<!ELEMENT person (student*)>
<!ENTITY text "hello world">
<!--
	定义引用实体：在dtd中定义，在xml中使用。
	语法：<!ENTITY 实体名称  "实体内容">
	应用方法：&实体名称;
	注意:定义实体需要写在内部dtd里面,如果写在外部的dtd里面,有一些浏览器不能得到实体内容
-->
]>
 
<person>
	<student>&text;</student>
</person>
```

实例：
dtd约束文件:

```
<!ELEMENT TVSCHEDULE (CHANNEL+)>

<!ELEMENT CHANNEL (BANNER,DAY+)>
<!ELEMENT BANNER (#PCDATA)>

<!ELEMENT DAY (DATE,(HOLIDAY|PROGRAMSLOT+)+)>
<!ELEMENT HOLIDAY (#PCDATA)>
<!ELEMENT DATE (#PCDATA)>

<!ELEMENT PROGRAMSLOT (TIME,TITLE,DESCRIPTION?)>
<!ELEMENT TIME (#PCDATA)>
<!ELEMENT TITLE (#PCDATA)> 
<!ELEMENT DESCRIPTION (#PCDATA)>

<!ATTLIST TVSCHEDULE NAME CDATA #REQUIRED>
<!ATTLIST CHANNEL CHAN CDATA #REQUIRED>
<!ATTLIST PROGRAMSLOT VTR CDATA #IMPLIED>
<!ATTLIST TITLE RATING CDATA #IMPLIED>
<!ATTLIST TITLE LANGUAGE CDATA #IMPLIED>
```

对应的xml文件：
```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE TVSCHEDULE SYSTEM "TV.dtd">
<TVSCHEDULE NAME="CCTV">
	<CHANNEL CHAN="CCC">
		<BANNER>AAAAA</BANNER>
		<DAY>
			<DATE>2018-6-3</DATE>
			<!-- <HOLIDAY></HOLIDAY> -->
			<PROGRAMSLOT VTR="sss">
				<TIME>1990</TIME>
				<TITLE RATING="" LANGUAGE="Chinese">test</TITLE>
				<DESCRIPTION>hh</DESCRIPTION>
			</PROGRAMSLOT>
		</DAY>
	</CHANNEL>
</TVSCHEDULE>
```