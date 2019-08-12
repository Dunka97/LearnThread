package com.dunka.chapter02.synBlockMoreObjectOneLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 12:03   2019/8/12
 * @ClassName ThreadA
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        Service.printB();
    }
}
