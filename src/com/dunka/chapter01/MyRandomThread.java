package com.dunka.chapter01;

import java.util.Random;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:29   2019/8/7
 * @ClassName MyRandomThread
 */
public class MyRandomThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName()+"i="+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
