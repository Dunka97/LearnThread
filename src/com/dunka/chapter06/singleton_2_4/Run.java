package com.dunka.chapter06.singleton_2_4;

/**
 * @Author Dunka
 * @Description 延迟加载/“懒汉模式”解决方案--使用DCL双检查锁机制
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
