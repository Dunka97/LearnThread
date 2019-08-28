package com.dunka.chapter03.joinTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:50   2019/8/28
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
