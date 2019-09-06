package com.dunka.chapter07.autoAddGroup;

/**
 * @Author Dunka
 * @Description 显式--在线程组里加线程组
 * @Date 17:05   2019/9/4
 * @ClassName mainGroup
 */
public class mainGroup {
    public static void main(String[] args) {
        System.out.println("线程组名称："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量："+Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组的数量-加之前"+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");
        System.out.println("线程组中线程组的数量-加之后"+Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称："+Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
