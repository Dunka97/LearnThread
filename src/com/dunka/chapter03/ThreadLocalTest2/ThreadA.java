package com.dunka.chapter03.ThreadLocalTest2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:02   2019/8/29
 * @ClassName ThreadA
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("ThreadA get =" + Tools.ext.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
