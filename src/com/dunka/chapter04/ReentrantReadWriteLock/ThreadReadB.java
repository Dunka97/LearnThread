package com.dunka.chapter04.ReentrantReadWriteLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:22   2019/8/30
 * @ClassName ThreadReadA
 */
public class ThreadReadB extends Thread {
    private MyService myService;

    public ThreadReadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.read();
    }
}
