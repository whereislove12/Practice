package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day14_NetworkProgramming;

/**
 * 网络通信协议：
 * 通信协议是对计算机必须遵守的规则，只有遵守这些规则，计算机之间才能进行通信。这就好比在道路中行驶的汽车一定要遵守交通规则一样，
 * 协议中对数据的传输格式、传输速率、传输步骤等做了统一规定，通信双方必须同时遵守，最终完成数据交换。
 * TCP/IP协议：
 * 传输控制协议/因特网互联协议( Transmission Control Protocol/Internet Protocol)，是Internet最基本、最广泛的协议。
 * 它定义了计算机如何连入因特网，以及数据如何在它们之间传输的标准。它的内部包含一系列的用于处理数据通信的协议，
 * 并采用了4层的分层模型，每一层都呼叫它的下一层所提供的协议来完成自己的需求
 * TCP/IP协议中的四层分别是应用层、传输层、网络层和链路层:
 * 链路层：是用于定义物理传输通道，通常是对某些网络连接设备的驱动协议，例如针对光纤、提供的驱动。
 * 网络层：网络层是整个TCP/IP协议的核心，它主要用于将传输的数据进行分组，将分组数据发送到目标计算机或者网络。
 * 传输层：主要使网络程序进行通信，在进行网络通信时，可以采用TCP协议，也可以采用UDP协议。
 * 应用层：主要负责应用程序的协议，例如HTTP协议、FTP协议等
 * *****************************************************************************************************************
 * TCP：
 * 传输控制协议 (Transmission Control Protocol)。TCP协议是 面向连接 的通信协议，即传输数据之前，
 * 在发送端和接收端建立逻辑连接，然后再传输数据，它提供了两台计算机之间可靠无差错的数据传输。
 * 三次握手：
 * TCP协议中，在发送数据的准备阶段，客户端与服务器之间的三次交互，以保证连接的可靠。
 * 第一次握手，客户端向服务器端发出连接请求，等待服务器确认。
 * 第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求。
 * 第三次握手，客户端再次向服务器端发送确认信息，确认连接。
 * UDP：
 * 用户数据报协议(User Datagram Protocol)。UDP协议是一个 面向无连接 的协议。传输数据时，不需要建立连接，
 * 不管对方端服务是否启动，直接将数据、数据源和目的地都封装在数据包中，直接发送。每个数据包的大小限制在64k以内。
 * 它是不可靠协议，因为无连接，所以传输速度快，但是容易丢失数据。日常应用中,例如视频会议、QQ聊天等。
 * 每次发送的数据最大为64kb。
 * *****************************************************************************************************************
 * 网络编程三要素:
 * 1.协议：
 * 计算机网络通信必须遵守的规则
 * 2.IP地址:
 * 指互联网协议地址（Internet Protocol Address），俗称IP。IP地址用来给一个网络中的计算机设备做唯一的编号。
 * IP地址分类
 * IPv4：是一个32位的二进制数，通常被分为4个字节，表示成`a.b.c.d` 的形式，例如`192.168.65.100` 。其中a、b、c、d都是0~255之间的十进制整数，那么最多可以表示42亿个。
 * IPv6：由于互联网的蓬勃发展，IP地址的需求量愈来愈大，但是网络地址资源有限，使得IP的分配越发紧张。有资料显示，全球IPv4地址在2011年2月分配完毕。
 * 为了扩大地址空间，拟通过IPv6重新定义地址空间，采用128位地址长度，每16个位一组，分成8组十六进制数，
 * 表示成`ABCD:EF01:2345:6789:ABCD:EF01:2345:6789`，号称可以为全世界的每一粒沙子编上一个网址，这样就解决了网络地址资源数量不够的问题。
 * 常用命令:
 * 查看本机IP地址，在控制台输入：ipconfig
 * 检查网络是否连通，在控制台输入：ping 空格 IP地址
 * 3.端口号:
 * 网络的通信，本质上是两个进程（应用程序）的通信。每台计算机都有很多的进程，那么在网络通信时，如何区分这些进程呢？
 * 如果说 IP地址 可以唯一标识网络中的设备，那么 端口号 就可以唯一标识设备中的进程（应用程序）了。
 * 端口号：用两个字节表示的整数，它的取值范围是0~65535**。其中，0~1023之间的端口号用于一些知名的网络服务和应用，普通的应用程序需要使用1024以上的端口号。
 * 如果端口号被另外一个服务或应用所占用，会导致当前程序启动失败。
 * *****************************************************************************************************************
 * 利用`协议`+`IP地址`+`端口号` 三元组合，就可以标识网络中的进程了，那么进程间的通信就可以利用这个标识与其它进程进行交互。
 */
public class ProtocolDemo {
}
