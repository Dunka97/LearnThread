package com.dunka.chapter04.ReentrantLockTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:38   2019/8/29
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
