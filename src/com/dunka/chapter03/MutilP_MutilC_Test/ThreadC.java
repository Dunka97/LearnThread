package com.dunka.chapter03.MutilP_MutilC_Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:43   2019/8/28
 * @ClassName ThreadC
 */
public class ThreadC extends Thread{
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.getValue();
        }
    }
}
