package com.dunka.chapter07.stateTest4;

/**
 * @Author Dunka
 * @Description 验证WAITING
 * @Date 21:00   2019/9/3
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的myThreaad状态："+myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
