package com.dunka.chapter04.MustUseMoreCondition;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description 使用多个Condition实例实现部分线程通知。
 * @Date 14:20   2019/8/29
 * @ClassName Run
 */
public class Run {
    @Test
    public void TestCondition() throws InterruptedException {
        System.out.println(Integer.MAX_VALUE);
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        threadB.start();
        Thread.sleep(5000);
        myService.signalAll_B();
    }
}
