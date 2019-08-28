package com.dunka.chapter03.MutilP_MutilC_Test;

/**
 * @Author Dunka
 * @Description 消费者
 * @Date 10:39   2019/8/28
 * @ClassName Consumer
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println(Thread.currentThread().getName()+"正在等待");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行");
//                System.out.println("get的值是"+ ValueObject.value);
                ValueObject.value = "";
//                lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
