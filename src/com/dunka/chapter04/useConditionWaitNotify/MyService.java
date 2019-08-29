package com.dunka.chapter04.useConditionWaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 14:03   2019/8/29
 * @ClassName MyService
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("await："+System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        lock.lock();
        System.out.println("signal:"+System.currentTimeMillis());
        condition.signal();
        lock.unlock();
    }
}
