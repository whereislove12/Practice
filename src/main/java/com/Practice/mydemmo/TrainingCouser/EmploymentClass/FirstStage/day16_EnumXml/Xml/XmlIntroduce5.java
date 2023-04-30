package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.List;

/**
 * 命名空间:
 * 如果一个XML文档中使用多个Schema文件，而这些Schema文件中定义了相同名称的元素时就会出现名字冲突。
 * 这就像一个Java文件中使用了import java.util.*和import java.sql.*时，在使用Date类时，那么就不明确Date是哪个包下的Date了。
 * 名称空间就是用来处理元素和属性的名称冲突问题，与Java中的包是同一用途。
 * 如果每个元素和属性都有自己的名称空间，那么就不会出现名字冲突问题，就像是每个类都有自己所在的包一样，那么类名就不会出现冲突。
 * 声明命名空间:
 * 默认命名空间：<xxx xmlns=””>，使用<标签>
 * 显式命名空间：<xxx xmlns:别名=””>，使用<别名:标签>
 * ***************************************************************************************************************
 * XML解析:
 * 开发中比较常见的解析方式有三种:
 * 1.DOM：
 * 要求解析器把整个XML文档装载到内存，并解析成一个Document对象,通过Document对象就可以对DOM进行操作。
 * 优点：元素与元素之间保留结构关系，故可以进行增删改查操作。
 * 缺点：XML文档过大，可能出现内存溢出显现。
 * 2.SAX：是一种速度更快，更有效的方法。它逐行扫描文档，一边扫描一边解析。并以事件驱动的方式进行具体解析，每执行一行，都将触发对应的事件。
 * 优点：处理速度快，可以处理大文件
 * 缺点：只能读，逐行后将释放资源。
 * 3.PULL：Android内置的XML解析方式，类似SAX。
 * ***************************************************************************************************************
 * XML解析 API使用:
 * 1.DOM4J:******************************
 * 是一个Java的XML API，具有性能优异、功能强大和极其易使用的特点，它的性能超过sun公司官方的dom技术，如今可以看到越来越多的Java软件都在使用DOM4J来读写XML。
 * 如果想要使用DOM4J，需要引入支持xpath的jar包 `dom4j-1.6.1.jar`
 * DOM4J必须使用核心类SaxReader加载xml文档获得Document，通过Document对象获得文档的根元素，然后就可以操作了。
 * 常用AP:
 * (1).SaxReader对象:read(…) 加载执行xml文档
 * (2).Document对象:getRootElement() 获得根元素
 * (3).Element对象:
 * elements(…) 获得指定名称的所有子元素。可以不指定名称
 * element(…) 获得指定名称第一个子元素。可以不指定名称
 * getName() 获得当前元素的元素名
 * attributeValue(…) 获得指定属性名的属性值
 * elementText(…) 获得指定名称子元素的文本值
 * getText() 获得当前元素的文本内容
 * 2.XPath******************************
 * XPath 是一门在 XML、html 文档中查找信息的语言。
 * XPath 是一个 W3C 标准，可通过W3CSchool文档查阅语法
 * 由于DOM4J在解析XML时只能一层一层解析，所以当XML文件层数过多时使用会很不方便，结合XPATH就可以直接获取到某个元素
 * 默认的情况下，dom4j不支持xpath，如果想要在dom4j里面使用xpath，需要引入支持xpath的jar包 `jaxen-1.1.6.jar
 * 在dom4j里面提供了两个方法，用来支持xpath:
 * (1).List<Node> selectNodes("xpath表达式")，用来获取多个节点
 * (2).Node selectSingleNode("xpath表达式")，用来获取一个节点
 * xpath表达式常用查询形式:
 * (1).第一种查询形式:
 * /AAA/DDD/BBB： 表示一层一层的，AAA下面 DDD下面的BBB
 * (2).第二种查询形式:
 * //BBB： 表示和这个名称相同，表示只要名称是BBB 都得到
 * (3).第三种查询形式:
 * /*: 所有元素
 * (4).第四种查询形式:
 * BBB[1]：表示第一个BBB元素
 * BBB[last()]：表示最后一个BBB元素
 * (5).第五种查询形式
 * //BBB[@id]： 表示只要BBB元素上面有id属性 都得到
 * (6).第六种查询形式
 * //BBB[@id='b1'] 表示元素名称是BBB,在BBB上面有id属性，并且id的属性值是b1
 */
public class XmlIntroduce5 {
    @Test
    public void paresDom4jXml() throws FileNotFoundException, DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new FileInputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day16_EnumXml\\Xml\\Dom4jXml.xml"));

        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        for (Element element : elements) {
            String id = element.attributeValue("id");
            String className = element.attributeValue("className");
            System.out.println(id + "" + className);

            List<Element> childElements = element.elements();
            for (Element childElement : childElements) {
                String name = childElement.attributeValue("name");
                String value = childElement.attributeValue("value");
                System.out.println(name + "" + value);
            }
        }
    }

    @Test
    public void paresXpathXml() throws MalformedURLException, DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day16_EnumXml\\Xml\\XpathXml.xml"));

        //4.结合xpath语法查询
        //4.1查询所有student标签
        List<Node> nodes = document.selectNodes("//student");
        for (Node node : nodes) {
            System.out.println(node);
        }

        System.out.println("--------------------");

        //4.2查询所有student标签下的name标签
        nodes = document.selectNodes("//student/name");
        for (Node node : nodes) {
            System.out.println(node);
        }

        System.out.println("--------------------");

        //4.3查询student标签下带有id属性的name标签
        nodes = document.selectNodes("//student/name[@id]");
        for (Node node : nodes) {
            System.out.println(node);
        }

        System.out.println("--------------------");

        //4.4查询student标签下带有id属性的name标签 并且id属性值为itcast
        nodes = document.selectNodes("//student/name[@id='itcast']");
        for (Node node : nodes) {
            System.out.println(node);
        }
    }
}
