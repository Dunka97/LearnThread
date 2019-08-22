package com.dunka.chapter03.Test2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 9:33   2019/8/22
 * @ClassName MyThread1
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            try {
                System.out.println("wait开始："+System.currentTimeMillis());
                lock.wait();
                System.out.println("wait结束："+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
