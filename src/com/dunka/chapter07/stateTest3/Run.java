package com.dunka.chapter07.stateTest3;

/**
 * @Author Dunka
 * @Description 验证BLOCKED:BLOCKED状态出现在某一个线程在等待锁的时候
 * @Date 20:54   2019/9/3
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("a");
        myThread1.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("b");
        myThread2.start();
        System.out.println("main方法中的myThread2状态："+myThread2.getState());
    }
}
