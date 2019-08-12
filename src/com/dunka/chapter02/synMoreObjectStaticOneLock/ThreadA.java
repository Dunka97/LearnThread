package com.dunka.chapter02.synMoreObjectStaticOneLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 12:03   2019/8/12
 * @ClassName ThreadA
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        Service.printA();
    }
}
