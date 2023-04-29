package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

/**
 * String类getBytes()方法介绍 :
 * byte[] getBytes() 使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
 * 1.使用平台默认字符集，将字符串编码为字节数组。
 * 2.平台通常指的是操作系统平台，而中文版操作系统平台的默认字符集是GBK。
 * byte[] getBytes(String charsetName )使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 * **************************************************************************************************************
 * java.io.Reader 抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入流的基本 共性功能方法。
 * public void close() ：关闭此流并释放与此流相关联的任何系统资源。 public int read() ： 从输入流读取一个字符。
 * public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
 * **************************************************************************************************************
 * java.io.FileReader 类是读取字符文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。
 * 构造方法 :
 * FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
 * FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的名称。
 * 读取字符： read 方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回 -1 ，循环读取
 * 使用字符数组读取： read(char[] cbuf) ，每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到 末尾时，返回 -1
 * **************************************************************************************************************
 * java.io.Writer 抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。它定义了字节输出流的 基本共性功能方法。
 * public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
 * public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
 * public void write(int c) ：写出一个字符。
 * public void write(char[] cbuf) ：将 b.length字符从指定的字符数组写出此输出流。
 * public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off 开始输出到此输出流。
 * public void write(String str) ：写出一个字符串。
 * ***************************************************************************************************************
 * java.io.FileWriter 类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。 构造方法
 * FileWriter(File file) ： 创建一个新的 FileWriter，给定要读取的File对象。
 * FileWriter(String fileName) ： 创建一个新的 FileWriter，给定要读取的文件的名称。
 * 写出字符： write(int b) 方法，每次可以写出一个字符数据
 * 写出字符： write(int b) 方法，每次可以写出一个字符数据
 * ***************************************************************************************************************
 * 关闭和刷新 :
 * 因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。
 * 如果我 们既想写出数据，又想继续使用流，就需要 flush 方法了。
 * flush ：刷新缓冲区，流对象可以继续使用。
 * close ：关闭流，释放系统资源。关闭前会刷新缓冲区。
 * ***************************************************************************************************************
 * 写出其他数据:
 * 1. 写出字符数组 ： write(char[] cbuf) 和 write(char[] cbuf, int off, int len) ，
 * 每次可以写出字符数组中的数据，用法类似FileOutputStream
 * 2. 写出字符串： write(String str) 和 write(String str, int off, int len) ，每次可以写出字符串中的数据，更为方便
 * 3. 续写和换行：操作类似于FileOutputStream
 */
public class IOType2 {
}
