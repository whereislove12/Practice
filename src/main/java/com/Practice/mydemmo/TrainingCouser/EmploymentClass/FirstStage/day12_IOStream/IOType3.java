package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

/**
 * 转换流 java.io.InputStreamReader ，是Reader的子类，是从字节流到字符流的桥梁。
 * 它读取字节，并使用指定的字符 集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。
 * 构造方法 :
 * InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
 * InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。
 * **************************************************************************************************************
 * 转换流 java.io.OutputStreamWriter ，是Writer的子类，是从字符流到字节流的桥梁。
 * 使用指定的字符集将字符编码为 字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。
 * 构造方法 :
 * OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
 * OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流。
 * **************************************************************************************************************
 * Java 提供了一种对象序列化的机制。用一个字节序列可以表示一个对象，该字节序列包含该对象的数据 、对象的类型和对象中存储的属性等信息。
 * 字节序列写出到文件之后，相当于文件中持久保存了一个对象的信息。
 * 反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化。对象的数据 、对象的类型和对象中存储的数据信息，都可以用来在内存中创建对象。
 * java.io.ObjectOutputStream 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
 * 构造方法:
 * public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。
 * 序列化操作:
 * 1. 一个对象要想序列化，必须满足两个条件:
 * 该类必须实现 java.io.Serializable 接口， Serializable 是一个标记接口，不实现此接口的类将不会使任何状 态序列化或反序列化，会抛出 NotSerializableException 。
 * 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用transient 关键字修饰。
 * 2.写出对象方法 public final void writeObject (Object obj) : 将指定的对象写出。
 * **************************************************************************************************************
 * ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
 * 构造方法:
 * public ObjectInputStream(InputStream in) ： 创建一个指定InputStream的ObjectInputStream。
 * 反序列化操作1 :
 * 如果能找到一个对象的class文件，我们可以进行反序列化操作，调用 ObjectInputStream 读取对象的方法：
 * public final Object readObject () : 读取一个对象。
 * 对于JVM可以反序列化对象，它必须是能够找到class文件的类。如果找不到该类的class文件，则抛出一个 ClassNotFoundException 异常。
 * 反序列化操作2 :
 * 另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失 败，抛出一个 InvalidClassException异常。发生这个异常的原因如下：
 * 该类的序列版本号与从流中读取的类描述符的版本号不匹配 该类包含未知数据类型
 * 该类没有可访问的无参数构造方法
 * Serializable 接口给需要序列化的类，提供了一个序列版本号。 serialVersionUID 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。
 */
public class IOType3 {

}
