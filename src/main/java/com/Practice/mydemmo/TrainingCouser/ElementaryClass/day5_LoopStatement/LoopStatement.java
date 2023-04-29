package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day5_LoopStatement;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * 循环语句
 *
 * 三种循环的区别:
 * 1.for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
 * 2.do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）
 * for循环和while的区别:
 * 1.控制条件语句所控制的那个变量，在for循环结束后，就不能再被访问到了，而while循环结束还可以 继续使用，如果你想继续使用，
 * 就用while，否则推荐使用for。原因是for循环结束，该变量就从内 存中消失，能够提高内存的使用效率。
 * 2.条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被 访问到了
 * 3.条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该 变量还可以继续使用
 * 三种循环的区别总结
 * 1.建议使用的顺序:for,while,do-while
 * 2.循环次数确定的话,建议使用for,循环次数不确定建议使用while
 * 3.do-while循环来讲的话,至少执行一次
 * 4.while和do-while循环而言,循环结束后,初始化条件中定义的变量可以继续使用, 但是for循环的不能使用(在for循环内部定义初始化语句)
 */
public class LoopStatement {
    @Test
    public void statement1() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void statement2() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num = 0; num < nums.length; num++) {
            System.out.println(num);
        }
    }

    /**
     * 求1-5之间数字相加的和
     */
    @Test
    public void test1() {
        int i = 0;
        for (int num = 0; num < 5; num++) {
            i += num;
        }
        System.out.println(i);
    }

    /**
     * 求 1-100 之间偶数的和
     */
    @Test
    public void test2() {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                num += i;
            }
        }
        System.out.println(num);
    }

    /**
     * 水仙花数
     * <p>
     * 解释：什么是水仙花数？ 水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
     * 例如 153 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153
     * <p>
     * 提示:
     * 获取各位的数字:%10
     * 获取十位的数字:/10%10
     * 获取百位的数字:/100%10
     */
    @Test
    public void daffodilNumber() {
        ArrayList<Integer> daffodilNums = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            int unitDigit = i % 10;
            int tensDigit = i / 10 % 10;
            int hundredsDigit = i / 100 % 10;
            if ((unitDigit * unitDigit * unitDigit + tensDigit * tensDigit * tensDigit + hundredsDigit * hundredsDigit * hundredsDigit) == i) {
                daffodilNums.add(i);
            }
        }
        System.out.println("水仙花数有:" + daffodilNums);
    }

    @Test
    public void daffodilNums2() {
        int count = 0;
        //输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        for (int i = 100; i < 1000; i++) {
            //在计算之前获取三位数中每个位上的值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            //判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
                //输出满足条件的数字就是水仙花数
                System.out.println(i);
            }
        }
        System.out.println("共有" + count + "个水仙花数");
    }

    @Test
    public void statement3() {
        while (true) {
            for (int i = 1; i <= 100; i++) {
                if (i <= 100) {
                    System.out.println("还没到100,现在是:" + i);
                } else {
                    break;
                }
            }
            break;
        }
    }

    /**
     * 世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度 是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
     */
    @Test
    public void foldedPaperHalfTimes() {
        int paperThickness = 1;
        int times = 0;
        while (paperThickness < 88444300) {
            paperThickness *= 2;
            times++;
        }
        System.out.println("对折了:" + times + "次");
    }

    @Test
    public void foldedPaperHalfTimes2() {
        //定义一个计数器，初始值为0
        int count = 0;
        //定义纸张厚度
        double paper = 0.1;
        //定义珠穆朗玛峰的高度
        int zf = 8844430;
        //因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        // 折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while (paper <= zf) {
            //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            paper *= 2;
            //在循环中执行累加，对应折叠了多少次
            count++;
        }
        //打印计数器的值
        System.out.println("需要折叠：" + count + "次");
    }

    @Test
    public void statement4() {
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);
    }

    @Test
    public void statement5(){
        do {
            System.out.println("无条件执行一次");
        }while (false);
    }
}
