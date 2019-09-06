package com.dunka.chapter07.groupAddThread;

/**
 * @Author Dunka
 * @Description 1级关联
 * @Date 15:50   2019/9/4
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadGroup group = new ThreadGroup("Dunka的线程组");
        Thread thread = new Thread(group,a);
        Thread thread1 = new Thread(group,b);
        thread.start();
        thread1.start();
        System.out.println("活动的线程数为："+group.activeCount());
        System.out.println("线程组的名称为："+group.getName());
    }
}
