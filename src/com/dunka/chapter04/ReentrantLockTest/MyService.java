package com.dunka.chapter04.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:33   2019/8/29
 * @ClassName MyService
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"("+(i+1)+")");
        }
        lock.unlock();
    }
}
