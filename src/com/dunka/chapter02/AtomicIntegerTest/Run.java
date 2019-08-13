package com.dunka.chapter02.AtomicIntegerTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:59   2019/8/13
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread countThread = new AddCountThread();
        Thread thread1 = new Thread(countThread);
        Thread thread2 = new Thread(countThread);
        Thread thread3 = new Thread(countThread);
        Thread thread4 = new Thread(countThread);
        Thread thread5 = new Thread(countThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
