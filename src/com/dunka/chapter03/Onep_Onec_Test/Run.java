package com.dunka.chapter03.Onep_Onec_Test;

/**
 * @Author Dunka
 * @Description 一生产一消费，交替进行
 * @Date 10:45   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        String lock = "";
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP threadP = new ThreadP(producer);
        ThreadC threadC = new ThreadC(consumer);
        threadP.start();
        threadC.start();
    }
}
