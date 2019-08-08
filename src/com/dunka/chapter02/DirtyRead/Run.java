package com.dunka.chapter02.DirtyRead;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:44   2019/8/8
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        MyThread2 thread2 = new MyThread2(list);
        thread1.setName("A");
        thread1.start();
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("list size = "+list.getSize());
    }
}
