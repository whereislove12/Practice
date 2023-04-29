package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;


/**
 * 不死神兔
 * <p>
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子， 假如兔子都不死，问第二十个月的兔子对数为多少？
 * <p>
 * 思路:
 * 1:为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
 * 2:因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
 * 3:用循环实现计算每个月的兔子对数
 * 4:输出数组中最后一个元素的值，就是第20个月的兔子对数
 */
public class ImmortalGodRabbit {
    public static void main(String[] args) {
        int[] rabbitNums = new int[20];
        //第一个月不变
        rabbitNums[0] = 1;
        //第二个月不变
        rabbitNums[2] = 1;
        //每一个第三个月都是每前两个月之和
        for (int i = 2; i < rabbitNums.length; i++) {
            rabbitNums[i] = rabbitNums[i - 2] + rabbitNums[i - 1];
        }
        System.out.println(rabbitNums[19]);
    }
}
