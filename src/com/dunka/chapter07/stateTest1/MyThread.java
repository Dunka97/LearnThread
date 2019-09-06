package com.dunka.chapter07.stateTest1;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:41   2019/9/3
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态："+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态："+Thread.currentThread().getState());
    }
}
