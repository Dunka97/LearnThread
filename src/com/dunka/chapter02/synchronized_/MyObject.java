package com.dunka.chapter02.synchronized_;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:41   2019/8/8
 * @ClassName MyObject
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName = "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("endTime = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void methodB(){
        try {
            System.out.println("begin methodB threadName = "+ Thread.currentThread().getName()
            +"begin Time = "+ System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
