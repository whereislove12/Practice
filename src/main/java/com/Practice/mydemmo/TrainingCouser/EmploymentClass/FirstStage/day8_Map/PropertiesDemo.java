package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day8_Map;

import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.Set;

/**
 * Map接口实现类Hashtable的子类Properties类。
 * Properties也是Map接口实现类，是存储键值对的双列集合，由于此类能 和IO流结合使用，数据可以持久化，使用量很大。
 * Properties集合特点:
 * 继承Hashtable，底层数据结构是哈希表。
 * 线程安全，运行速度慢。
 * 不允许null值，null键。
 * 此集合存储键值对数据类型固定为String。
 * 可以和IO流结合使用，从流中加载数据。
 * Properties集合特有方法:
 * Object setPropery(String key,String value) ，向集合中存储键值对。
 * String getProperty(String key) ，获取集合中键对应的值，无此键返回null。
 * Set<String> stringPropertyNames() ，集合中的所有键存储到Set集合。
 * void load(输入流对象)
 */
public class PropertiesDemo {
    @Test
    public void test1() {
        Properties properties = new Properties();
        //存储键值对
        properties.setProperty("k1", "v1");
        properties.setProperty("k2", "v2");
        properties.setProperty("k3", "v3");
        properties.setProperty("k4", "v4");
        //获取k2键对应的值
        System.out.println(properties.getProperty("k2"));
        //所有的键存储到Set集合
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String propertyName : propertyNames) {
            System.out.println(propertyName);
        }
    }
}
