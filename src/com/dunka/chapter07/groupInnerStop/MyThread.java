package com.dunka.chapter07.groupInnerStop;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 17:11   2019/9/4
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName = "+Thread.currentThread().getName()+"准备开始死循环了：");
        while (!this.isInterrupted()){

        }
        System.out.println("ThreadName = "+Thread.currentThread().getName()+"结束了");
    }
}
