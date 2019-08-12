package com.dunka.chapter02.StringAndSyn2;

/**
 * @Author Dunka
 * @Description 出现情况都是打印A,因为String的两个值都是AA，两个线程持有相同的锁，所以造成线程B不能执行
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
        Service.print(new Object());
    }
}
