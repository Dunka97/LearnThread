package com.dunka.chapter03.Onep_Onec_Test;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:43   2019/8/28
 * @ClassName ThreadP
 */
public class ThreadP extends Thread {
    private Producer producer;

    public ThreadP(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            producer.setValue();
        }
    }
}
