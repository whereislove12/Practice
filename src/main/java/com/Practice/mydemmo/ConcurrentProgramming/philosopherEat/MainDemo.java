package com.Practice.mydemmo.ConcurrentProgramming.philosopherEat;

import org.junit.jupiter.api.Test;

/**
 * 多线程之哲学家吃饭问题
 * 五个哲学家,五双筷子,如何吃饭
 * 思路:每个筷子就是一把锁,每个哲学家需要同时获得两双筷子
 */
public class MainDemo {
    @Test
    public void eatTest1(){
        Chopsticks chopsticks1 = new Chopsticks(1);
        Chopsticks chopsticks2 = new Chopsticks(2);
        Chopsticks chopsticks3 = new Chopsticks(3);
        Chopsticks chopsticks4 = new Chopsticks(4);
        Chopsticks chopsticks5 = new Chopsticks(5);

        Philosopher philosopher1 = new Philosopher(chopsticks1,chopsticks2,1);
        Philosopher philosopher2 = new Philosopher(chopsticks2,chopsticks3,2);
        Philosopher philosopher3 = new Philosopher(chopsticks3,chopsticks4,3);
        Philosopher philosopher4 = new Philosopher(chopsticks4,chopsticks5,4);
        Philosopher philosopher5 = new Philosopher(chopsticks5,chopsticks1,5);

        philosopher1.run();
        philosopher2.run();
        philosopher3.run();
        philosopher4.run();
        philosopher5.run();
    }
}
