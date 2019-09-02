package com.dunka.chapter06.singleton_6;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:01   2019/9/2
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        myThread1.start();
    }
}
