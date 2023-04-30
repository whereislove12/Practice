package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Socket;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Socket类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
 * 构造方法:
 * public Socket(String host, int port) :创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null ，则相当于指定地址为回送地址。
 * 成员方法
 * public InputStream getInputStream() ： 返回此套接字的输入流。
 * - 如果此Scoket具有相关联的通道，则生成的InputStream 的所有操作也关联该通道。
 * - 关闭生成的InputStream也将关闭相关的Socket。
 * public OutputStream getOutputStream() ： 返回此套接字的输出流。
 * - 如果此Scoket具有相关联的通道，则生成的OutputStream 的所有操作也关联该通道。
 * - 关闭生成的OutputStream也将关闭相关的Socket。
 * public void close() ：关闭此套接字。
 * - 一旦一个socket被关闭，它不可再使用。
 * - 关闭此socket也将关闭相关的InputStream和OutputStream 。
 * public void shutdownOutput() ： 禁用此套接字的输出流。
 * - 任何先前写出的数据将被发送，随后终止输出流。
 */
public class MySocket3 {
    public static void main(String[] args) throws IOException, DocumentException {
        SAXReader saxReader = new SAXReader();
        //获取类的加载器
        ClassLoader classLoader = MyServerSocket3.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("FirstStageDay16SocketPort.xml");

        Document document = saxReader.read(resourceAsStream);
        Element rootElement = document.getRootElement();
        Node node = rootElement.selectSingleNode("//port");

        Element element = (Element) node;
        int port = Integer.parseInt(element.getText());

        Socket socket = new Socket("127.0.0.1", port);

        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = "你好呀".getBytes();
        outputStream.write(bytes);

        socket.shutdownOutput();
        socket.close();
    }
}
