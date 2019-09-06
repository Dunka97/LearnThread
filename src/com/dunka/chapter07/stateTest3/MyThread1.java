package com.dunka.chapter07.stateTest3;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:53   2019/9/3
 * @ClassName MyThread1
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
