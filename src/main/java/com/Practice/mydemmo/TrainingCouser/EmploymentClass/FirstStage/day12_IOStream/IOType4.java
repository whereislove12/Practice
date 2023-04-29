package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

/**
 * 缓冲流,也叫高效流，是对4个基本的 FileXxx 流的增强，所以也是4个流，按照数据类型分类：
 * 字节缓冲流： BufferedInputStream ， BufferedOutputStream
 * 字符缓冲流： BufferedReader ， BufferedWriter
 * 缓冲流的基本原理:
 * 在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从 而提高读写的效率。
 * ************************************************************************************************
 * 字节缓冲流
 * 构造方法:
 * public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
 * public BufferedOutputStream(OutputStream out) ： 创建一个新的缓冲输出流。
 * 字符缓冲流
 * 构造方法:
 * public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
 * public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
 * 特有方法 :
 * BufferedReader： public String readLine() : 读一行文字。
 * BufferedWriter： public void newLine() : 写一行行分隔符,由系统属性定义符号。
 * *****************************************************************************************************************
 * System.out 的运行结果就是PrintStream打印流对象。
 * PrintStream继承OutputStream，本质上是字节输出流。
 * PrintWriter继承Writer，本质上是字符输出流。
 * 打印流的特点：
 * 打印流指负责输出数据，不负责数据来源。
 * 打印流永远不会抛出IOException。
 * 使用PrintWriter打印流，可以开启自动刷新功能。
 * 调用println，printf，format三个方法中的一个才能自动刷新。
 * PrintWriter类 :
 * public PrintWriter(String fileName) ： 使用指定的文件名创建一个新的打印流。
 * public PrintWriter(OutputStream out) ：使用指定的字节输出流构造打印流。
 * public PrintWriter(Writer writer) ：使用指定的字符输出流构造打印流。
 * ******************************************************************************************************************
 * CommonsIO的使用 :
 * IOUtils类:
 * 静态方法：IOUtils.copy(InputStream in,OutputStream out)传递字节流，实现文件复制。
 * 静态方法：IOUtils.closeQuietly(任意流对象)悄悄的释放资源，自动处理close()方法抛出的异常。
 * FileUtils类:
 * 静态方法：FileUtils.copyDirectoryToDirectory(File src,File dest);传递File类型的目录，进行整个目录的复制，自动进行递归遍历。
 * 静态方法：writeStringToFile(File file,String str)写字符串到文本文件中。
 * 静态方法：readFileToString(File file)读取文本文件，返回字符串。
 * ******************************************************************************************************************
 * 获取输入流的源文件名 (day14-UploadFile)
 * public DataInputStream(InputStream in)
 * 数据输出方先写出名称,然后刷新(写什么名字就是什么)
 * public final void writeUTF(String str)
 * public void flush()
 * 数据输入方读取名称
 * public final String readUTF()
 */
public class IOType4 {
}
