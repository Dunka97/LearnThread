package com.dunka.chapter06.singleton_2_3;

/**
 * @Author Dunka
 * @Description 延迟加载/“懒汉模式”解决方案--针对某些重要的代码进行单独的同步---遇到多线程无法解决单例问题
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
