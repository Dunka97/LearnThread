package com.dunka.chapter04.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:18   2019/8/30
 * @ClassName MyService
 */
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            try {
                lock.readLock().lock();
                System.out.println("读锁-"+Thread.currentThread().getName()+System.currentTimeMillis());
                Thread.sleep(10000);
            }finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println("写锁-"+Thread.currentThread().getName()+System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
