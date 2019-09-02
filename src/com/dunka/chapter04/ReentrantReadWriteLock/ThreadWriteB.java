package com.dunka.chapter04.ReentrantReadWriteLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:22   2019/8/30
 * @ClassName ThreadWriteB
 */
public class ThreadWriteB extends Thread {
    private MyService myService;

    public ThreadWriteB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.write();
    }
}
