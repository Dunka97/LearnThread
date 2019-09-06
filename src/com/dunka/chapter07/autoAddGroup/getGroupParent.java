package com.dunka.chapter07.autoAddGroup;

/**
 * @Author Dunka
 * @Description 获取根线程组
 * @Date 17:01   2019/9/4
 * @ClassName getGroupParent
 */
public class getGroupParent {
    public static void main(String[] args) {
        System.out.println("线程："+Thread.currentThread().getName()
        +" 所在的线程组为："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所在的线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup()
        .getParent().getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup()
                .getParent().getParent().getName());//出现空异常
    }
}
