package com.dunka.chapter01;

/**
 * @Author Dunka
 * @Description Runnable接口，Java单继承多实现以解决继承Thread类的局限性
 * @Date 10:56   2019/8/7
 * @ClassName Test05_MyRunnable
 */
public class Test05_MyRunnable {
    public static void main(String[] args) {
         Runnable runnable = new MyRunnable();
         Thread thread = new Thread(runnable);
         thread.start();
        System.out.println("运行结束");
    }
}
