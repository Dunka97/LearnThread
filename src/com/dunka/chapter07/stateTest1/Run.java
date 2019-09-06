package com.dunka.chapter07.stateTest1;

/**
 * @Author Dunka
 * @Description 验证NEW RUNNABLE TERMINATED
 * @Date 20:42   2019/9/3
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            System.out.println("main方法中的状态1："+myThread.getState());
            Thread.sleep(1000);
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2："+myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
