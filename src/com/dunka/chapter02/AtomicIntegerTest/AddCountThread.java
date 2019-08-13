package com.dunka.chapter02.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:58   2019/8/13
 * @ClassName AddCountThread
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
