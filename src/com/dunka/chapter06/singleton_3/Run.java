package com.dunka.chapter06.singleton_3;

/**
 * @Author Dunka
 * @Description 使用静态内置类实现单例模式
 * @Date 11:20   2019/9/2
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread1.start();
        myThread2.start();
    }
}
