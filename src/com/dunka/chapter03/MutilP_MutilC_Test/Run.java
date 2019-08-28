package com.dunka.chapter03.MutilP_MutilC_Test;

/**
 * @Author Dunka
 * @Description 多生产多消费，会出现假死状态
 * @Date 10:45   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP[] threadPS = new ThreadP[2];
        ThreadC[] threadCS = new ThreadC[2];
        for (int i = 0; i <2 ; i++) {
         threadPS[i] = new ThreadP(producer);
         threadPS[i].setName("生产者"+(i+1));
         threadPS[i].start();
         threadCS[i] = new ThreadC(consumer);
         threadCS[i].setName("消费者"+(i+1));
         threadCS[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName()+" "+threads[i].getState());
        }
    }
}
