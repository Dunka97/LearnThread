package com.dunka.chapter02.StringAndSyn;

import com.dunka.chapter02.synMoreObjectStaticOneLock.ThreadB;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:08   2019/8/12
 * @ClassName Service
 */
public class Service {
    public static void print(String stringParam){
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                }
            }
        }catch (InterruptedException e) {
                    e.printStackTrace();
        }

        }
}
