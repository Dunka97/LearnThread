package com.dunka.chapter01.yield;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:42   2019/8/7
 * @ClassName MyThread
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000 ; i++) {
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒！");
    }
}
