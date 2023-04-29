package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day11_IOStream.File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


public class FileDemo {
    /**
     * File类的静态成员变量 :
     * static String pathSeparator :
     * 与系统有关的路径分隔符。
     * 1.Window操作系统，分隔符是分号。
     * 2.Linux操作系统，分隔符是冒号。
     * static String separator:
     * 与系统有关的默认名称分隔符。
     * 1.Window操作系统，名称分割符号为 \。
     * 2.Linux操作系统，名称分隔符号为 /。
     */
    @Test
    public void test1() {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
    }

    /**
     * File类构造方法 :
     * public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
     * public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
     * public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
     */
    @Test
    public void test2() {
        File file1 = new File("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\洛圣都1.jpeg");
        File file2 = new File("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage", "day11_IOStream\\File\\洛圣都2.jpeg");
        File file3 = new File(new File("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage"), "day11_IOStream\\File\\洛圣都3.jpeg");
    }

    /**
     * File类的获取方法 :
     * public String getAbsolutePath() ：返回此File的绝对路径名字符串。
     * public String getPath() ：将此File转换为路径名字符串。
     * public String getName() ：返回由此File表示的文件或目录的名称。
     * public long length() ：返回由此File表示的文件的长度。
     * public File getParentFile() 返回由此File表示的文件或目录的父目录，如果没有父目录，返回null。
     */
    @Test
    public void test3() {
        File file1 = new File("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\洛圣都1.jpeg");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getParent());
        System.out.println(file1.getName());
        System.out.println(file1.length());
        System.out.println(file1.getParentFile());
    }

    /**
     * File类判断方法 :
     * public boolean exists() ：此File表示的文件或目录是否实际存在。
     * public boolean isDirectory() ：此File表示的是否为目录。
     * public boolean isFile() ：此File表示的是否为文件。
     */
    @Test
    public void test4() {
        File file1 = new File("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\洛圣都1.jpeg");

        System.out.println(file1.exists());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
    }

    /**
     * File类创建删除功能的方法:
     * public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * public boolean delete() ：删除由此File表示的文件或目录。 不进回收站，直接删除。
     * public boolean mkdir() ：创建由此File表示的目录。
     * public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
     */
    @Test
    public void test5() {
        File file1 = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\a.txt");
        System.out.println(file1.exists());
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());

        File file2 = new File("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream\\File\\newDir\\childDir");
        System.out.println(file2.exists());
        System.out.println(file2.mkdirs());
        System.out.println(file2.exists());
    }

    /**
     * File类目录遍历方法:
     * public String[] list() ：获取当前目录下的所有的目录和文件的字符串的名字
     * public File[] listFiles() 返回一个File数组，表示该File目录中的所有的子文件或目录、
     * public File[] listFiles(FileFilter filter) 返回一个File数组，表示该File目录中的所有的子文件或目录，
     * filter是文件过滤器，可以过滤不需要的文件。
     * FileFilter接口 文件过滤器接口，此接口的实现类可以传递给方法listFiles()，实现文件的过滤功能
     * FileFilter接口方法：
     * public boolean accept(File path) ：方法参数就是listFiles()方法获取到的文件或者目录的路径。如果方法返回true， 表示需要此路径，否则此路径将被忽略。
     * ***************************************************************************************************************
     * 测试遍历文件夹
     */
    @Test
    public void testErgodicFile() {
        FileErgodic.ergodicPrintFile("E:\\work\\Mine\\MyDemmo\\src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream");
    }
}
