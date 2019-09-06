package com.dunka.chapter07.threadExceptionMove;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:48   2019/9/5
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印："+(numInt+1));
    }
}
