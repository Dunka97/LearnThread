package com.dunka.chapter02.synStaticMethod;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 12:03   2019/8/12
 * @ClassName ThreadA
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        Service.printB();
    }
}
