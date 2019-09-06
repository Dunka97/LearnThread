package com.dunka.chapter07.autoAddGroup;

/**
 * @Author Dunka
 * @Description 线程组自动归属特性
 * @Date 16:17   2019/9/4
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A处线程："+Thread.currentThread().getName()
        +"所属的线程组名为："+Thread.currentThread().getThreadGroup().getName()
                + " 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新组");
//        Thread.sleep(4000);
        System.out.println("B处线程："+Thread.currentThread().getName()
                +"所属的线程组名为："+Thread.currentThread().getThreadGroup().getName()
                + " 中有线程组数量："+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for (int i = 0; i <threadGroup.length ; i++) {
            System.out.println("第一个线程组名称为："+threadGroup[i].getName());
        }
    }
}
