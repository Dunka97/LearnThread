package com.dunka.chapter07.groupAddThread;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:45   2019/9/4
 * @ClassName ThreadA
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName="+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
