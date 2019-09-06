package com.dunka.chapter07.stateTest4;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:59   2019/9/3
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
