package com.dunka.chapter07.stateTest2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:47   2019/9/3
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
