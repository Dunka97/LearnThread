package com.dunka.chapter02.atomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:05   2019/8/13
 * @ClassName MyService
 */
public class MyService {
    public static AtomicLong atomicLong = new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+atomicLong.addAndGet(100));
        atomicLong.addAndGet(1);
    }
}
