package com.dunka.chapter02.volatileTestThread;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:10   2019/8/13
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i <100 ; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i <100 ; i++) {
            myThreads[i].start();
        }
    }
}
