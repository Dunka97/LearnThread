package com.dunka.chapter03.MutilP_MutilC_Test;

/**
 * @Author Dunka
 * @Description 生产者
 * @Date 10:34   2019/8/28
 * @ClassName Producer
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println(Thread.currentThread().getName()+"正在等待");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行");
                String value = System.currentTimeMillis()+"_"
                        +System.nanoTime();
                ValueObject.value = value;
//                lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
