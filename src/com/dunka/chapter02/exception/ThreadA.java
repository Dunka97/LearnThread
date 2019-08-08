package com.dunka.chapter02.exception;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:52   2019/8/8
 * @ClassName ThreadA
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.testMethod();
    }
}
