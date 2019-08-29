package com.dunka.chapter04.MustUseMoreCondition;

import com.dunka.chapter02.synchronized_.ThreadA;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 14:13   2019/8/29
 * @ClassName MyService
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin ConditionA await："+System.currentTimeMillis()
            +"Thread Name:"+ Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end ConditionA await："+System.currentTimeMillis()
                    +"Thread Name:"+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin ConditionB await："+System.currentTimeMillis()
                    +"Thread Name:"+ Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end ConditionB await："+System.currentTimeMillis()
                    +"Thread Name:"+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println("begin SignalAll A："+System.currentTimeMillis()
                    +"Thread Name:"+ Thread.currentThread().getName());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println("begin SignalAll B："+System.currentTimeMillis()
                    +"Thread Name:"+ Thread.currentThread().getName());
            conditionB.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
