package com.dunka.chapter04.useConditionWaitNotify;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 14:06   2019/8/29
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
