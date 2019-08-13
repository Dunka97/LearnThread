package com.dunka.chapter02.innerClass2;

/**
 * @Author Dunka
 * @Description 本实验测试同步代码块synchronized(class2)对class2上锁后，其他线程只能以同步的方式调用class2的静态同步方法
 * @Date 16:53   2019/8/12
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.InnerClass1 in1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 in2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"T2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
