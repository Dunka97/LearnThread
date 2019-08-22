package com.dunka.chapter03.Test2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 9:33   2019/8/22
 * @ClassName MyThread1
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("notify开始："+System.currentTimeMillis());
            lock.notify();
            System.out.println("notify结束："+System.currentTimeMillis());
        }
    }
}
