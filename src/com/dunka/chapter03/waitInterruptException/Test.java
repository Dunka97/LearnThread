package com.dunka.chapter03.waitInterruptException;


/**
 * @Author Dunka
 * @Description 当线程呈wait()状态时，调用线程对象的interrupr()方法会出现InterruptedException异常
 * @Date 15:30   2019/8/26
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        Thread.sleep(5000);
        threadA.interrupt();
    }
}
