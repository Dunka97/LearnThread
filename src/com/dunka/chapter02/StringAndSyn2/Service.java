package com.dunka.chapter02.StringAndSyn2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:08   2019/8/12
 * @ClassName Service
 */
public class Service {
    public static void print(Object o){
        try {
            synchronized (o) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e) {
                    e.printStackTrace();
        }

        }
}
