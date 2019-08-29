package com.dunka.chapter03.ThreadLocalTest4;

/**
 * @Author Dunka
 * @Description 值继承再修改
 * @Date 10:33   2019/8/29
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main  "+ Tools.ext.get());
                Thread.sleep(100);
            }
            Thread.sleep(2000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
