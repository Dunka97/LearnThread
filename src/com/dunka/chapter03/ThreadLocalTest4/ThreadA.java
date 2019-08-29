package com.dunka.chapter03.ThreadLocalTest4;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:32   2019/8/29
 * @ClassName ThreadA
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("ThreadA  " + Tools.ext.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
