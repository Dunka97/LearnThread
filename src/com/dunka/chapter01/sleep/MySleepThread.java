package com.dunka.chapter01.sleep;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:38   2019/8/7
 * @ClassName MySleepThread
 */
public class MySleepThread extends  Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.getName()+"begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.getName()+"end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
