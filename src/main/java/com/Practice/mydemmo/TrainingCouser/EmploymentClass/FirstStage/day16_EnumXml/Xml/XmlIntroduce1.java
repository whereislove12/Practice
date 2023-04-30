package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Xml;

/**
 * XML ：可扩展标记语言（ EXtensible Markup Language ）
 * XML 是一种 标记语言 ，很类似 HTML，HTML文件也是XML文档，标签都是自定义的。 如：<user></user> 或 <student></student>
 * W3C在1998年2月发布1.0版本，2004年2月又发布1.1版本，单因为1.1版本不能向下兼容1.0版本，所以1.1没有人用。
 * 同时，在2004年2月W3C又发布了1.0版本的第三版。
 * ******************************************************************************************************************
 * XML 与 HTML 的主要差异:
 * 1.xml标签都是自定义的，html标签是预定义。
 * 2.xml的语法严格，html语法松散。
 * 3.xml是存储数据的，html是展示数据。
 * ******************************************************************************************************************
 * XML文档声明格式： <?xml version="1.0" encoding="UTF-8"?>
 * 1. 文档声明必须为<?xml开头，以?>结束；
 * 2. 文档声明必须从文档的0行0列位置开始；
 * 3. 文档声明只有2个属性：
 * (1). versioin：指定XML文档版本。必须属性
 * (2). encoding：指定当前文档的编码。可选属性，默认值是utf-8；
 * ******************************************************************************************************************
 * 元素 element : <bean></bean>
 * 1. 元素是XML文档中最重要的组成部分，
 * 2. 普通元素的结构开始标签、元素体、结束标签组成。例如：<hello>大家好</hello>
 * 3. 元素体：元素体可以是元素，也可以是文本，例如：<b><a>你好</a></b>
 * 4. 空元素：空元素只有开始标签，而没有结束标签，但元素必须自己闭合，例如：<c/>
 * 5. 元素命名：
 * (1). 区分大小写
 * (2). 不能使用空格，不能使用冒号:
 * (3). 不建议以XML、xml、Xml开头
 * 格式化良好的XML文档，必须只有一个根元素
 * ******************************************************************************************************************
 * 注释:
 * XML的注释，以 “<!--” 开始，以 “-->” 结束。注释内容会被XML解析器忽略
 * ******************************************************************************************************************
 * 转义字符:
 * (1)转义序列字符之间不能有空格；
 * (2) 转义序列必须以”;”结束；
 * (3) 单独出现的”&”不会被认为是转义的开始；
 * (4) 区分大小写。
 * 在XML中，需要转义的字符有：
 * (1)&　　　&amp;
 * (2)<　　　&lt;
 * (3)>　　　&gt;
 * (4)＂　　　&quot;
 * (5)＇　　　&apos;
 */
public class XmlIntroduce1 {
}