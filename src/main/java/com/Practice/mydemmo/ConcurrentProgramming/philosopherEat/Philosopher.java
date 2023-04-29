package com.Practice.mydemmo.ConcurrentProgramming.philosopherEat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Philosopher implements Runnable {
    private Chopsticks left;
    private Chopsticks right;
    private Integer index;

    @SneakyThrows
    @Override
    public void run() {
        if (index % 2 == 0) {
            synchronized (left) {
                System.out.println("哲学家" + index + "拿到了右筷子");
                Thread.sleep(1000);
                synchronized (right) {
                    System.out.println("哲学家" + index + "拿到了左筷子");
                    Thread.sleep(1000);
                    System.out.println("哲学家" + index + "吃到了饭");
                }
            }
        } else {
            synchronized (right) {
                System.out.println("哲学家" + index + "拿到了右筷子");
                Thread.sleep(1000);
                synchronized (left) {
                    System.out.println("哲学家" + index + "拿到了左筷子");
                    Thread.sleep(1000);
                    System.out.println("哲学家" + index + "吃到了饭");
                }
            }
        }
    }
}
