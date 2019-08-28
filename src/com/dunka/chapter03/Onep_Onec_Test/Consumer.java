package com.dunka.chapter03.Onep_Onec_Test;

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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是"+ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
