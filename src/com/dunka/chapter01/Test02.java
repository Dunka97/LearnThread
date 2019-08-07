package com.dunka.chapter01;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:27   2019/8/7
 * @ClassName Test02
 */
public class Test02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("main");
    }
}
