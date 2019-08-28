package com.dunka.chapter03.joinTest;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:52   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("等待子线程执行完毕");
    }
}
