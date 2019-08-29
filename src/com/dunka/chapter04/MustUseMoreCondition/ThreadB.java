package com.dunka.chapter04.MustUseMoreCondition;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 14:20   2019/8/29
 * @ClassName ThreadA
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
