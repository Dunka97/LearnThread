package com.dunka.chapter03.Onep_Onec_Test;

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
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"
                        +System.nanoTime();
                System.out.println("set的值是"+value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
