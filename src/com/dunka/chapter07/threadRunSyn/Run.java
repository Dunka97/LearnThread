package com.dunka.chapter07.threadRunSyn;

/**
 * @Author Dunka
 * @Description 使线程具有有序性
 * @Date 20:14   2019/9/5
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock,"A",1);
        MyThread b = new MyThread(lock,"B",2);
        MyThread c = new MyThread(lock,"C",0);
        a.start();
        b.start();
        c.start();
    }
}
