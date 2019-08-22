package com.dunka.chapter03.Test2;

/**
 * @Author Dunka
 * @Description 等待/通知机制实现
 * @Date 9:37   2019/8/22
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread1 thread1 = new MyThread1(lock);
        thread1.start();
        Thread.sleep(3000);
        MyThread2 thread2 = new MyThread2(lock);
        thread2.start();
    }
}
