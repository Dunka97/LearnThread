package com.dunka.chapter02.atomicIntegerNoSafe;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:08   2019/8/13
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] array = new MyThread[5];
        for (int i = 0; i < array.length ; i++) {
            array[i] = new MyThread(service);
        }
        for (int i = 0; i < array.length ; i++) {
            array[i].start();
        }
        Thread.sleep(1000);
        System.out.println(MyService.atomicLong.get());
    }
}
