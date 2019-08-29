package com.dunka.chapter03.ThreadLocalTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:02   2019/8/29
 * @ClassName ThreadA
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <50 ; i++) {
                Tools.threadLocal.set("ThreadB" + (i + 1));
                System.out.println("ThreadB get =" + Tools.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
