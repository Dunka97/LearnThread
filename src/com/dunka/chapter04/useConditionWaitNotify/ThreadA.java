package com.dunka.chapter04.useConditionWaitNotify;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 14:05   2019/8/29
 * @ClassName ThreadA
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
