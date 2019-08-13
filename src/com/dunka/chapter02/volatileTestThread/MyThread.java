package com.dunka.chapter02.volatileTestThread;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:08   2019/8/13
 * @ClassName MyThread
 */
public class MyThread extends  Thread{
    volatile public static int count;
    synchronized private static void addCount(){
        for (int i = 0; i <100 ; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
