package com.dunka.chapter02.atomicIntegerNoSafe;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:07   2019/8/13
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
