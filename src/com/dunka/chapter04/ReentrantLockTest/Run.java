package com.dunka.chapter04.ReentrantLockTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:39   2019/8/29
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
