package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Socket;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket类：这个类实现了服务器套接字，该对象等待通过网络的请求。
 * 构造方法:
 * public ServerSocket(int port)` ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。
 * 成员方法:
 * public Socket accept()` ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。
 */
public class MyServerSocket3 {
    public static void main(String[] args) throws IOException, DocumentException {
        SAXReader saxReader = new SAXReader();
        //获取类的加载器
        InputStream resourceAsStream = MyServerSocket3.class.getClassLoader().getResourceAsStream("FirstStageDay16SocketPort.xml");

        Document document = saxReader.read(resourceAsStream);
        Element rootElement = document.getRootElement();
        Node node = rootElement.selectSingleNode("//port");

        Element element = (Element) node;
        int port = Integer.parseInt(element.getText());

        ServerSocket serverSocket = new ServerSocket(port);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes, 0, len));
        accept.shutdownInput();
        accept.close();
        serverSocket.close();
    }
}
