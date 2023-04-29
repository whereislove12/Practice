package com.Practice.mydemmo.exerciseDemo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import com.alibaba.fastjson.JSON;

/**
 * @Author 贾文浩
 * @Date 2022 11 16 11 40
 **/

public class JSONDemo {
    @Test
    public void test01() {
        @Data
        class ImageDto {
            private Long id;
            private String url;
            private Integer width;
            private Integer height;
            private String checksum;
            private String originUrl;
            private String thumbnailUrl;
            private String title;
            private Integer angle;
        }

        ImageDto imageDto = new ImageDto();
        imageDto.setUrl("https://test-i.gsxcdn.com/7946851_s4f\0zb3p.png");
        String s = JSON.toJSONString(imageDto, SerializerFeature.PrettyFormat);
        System.out.println(s);
    }

    @Test
    public void test02(){
        System.out.println("你好\n你好");
    }

    @Test
    public void test03(){
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        class Dog{
            private String dogName;
            private Integer dogAge;
        }
        Dog dog = new Dog("小白", 3);
        System.out.println(JSON.toJSONString(dog,SerializerFeature.PrettyFormat));
    }
}
