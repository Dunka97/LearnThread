package com.dunka.chapter02.deadLockTest;

/**
 * @Author Dunka
 * @Description 出现死锁
 * @Date 15:31   2019/8/12
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
