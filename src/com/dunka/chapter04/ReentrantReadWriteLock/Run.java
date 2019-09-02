package com.dunka.chapter04.ReentrantReadWriteLock;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:25   2019/8/30
 * @ClassName Run
 */
public class Run {
    @Test
    public void ReadAndRead() throws InterruptedException {
        MyService myService = new MyService();
        ThreadReadA threadReadA = new ThreadReadA(myService);
        threadReadA.setName("A");
        Thread.sleep(1000);
        ThreadReadB threadReadA1 = new ThreadReadB(myService);
        threadReadA1.setName("B");
        threadReadA.start();
        threadReadA1.start();
    }
    @Test
    public void ReadAndWrite() throws InterruptedException {
        MyService myService = new MyService();
        ThreadReadA threadReadA = new ThreadReadA(myService);
        threadReadA.setName("A");
        ThreadWriteB threadWriteB = new ThreadWriteB(myService);
        threadWriteB.setName("B");
        threadReadA.start();
        Thread.sleep(15000);
        threadWriteB.start();
    }
}
