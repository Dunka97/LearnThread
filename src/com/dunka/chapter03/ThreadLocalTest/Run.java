package com.dunka.chapter03.ThreadLocalTest;

/**
 * @Author Dunka
 * @Description 体现了各个线程变量的隔离性
 * @Date 10:05   2019/8/29
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 30; i++) {
            Tools.threadLocal.set("Main:"+(i+1));
            System.out.println("Main get="+Tools.threadLocal.get());
            Thread.sleep(200);
        }
    }
}
