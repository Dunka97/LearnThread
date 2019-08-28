package com.dunka.chapter03.waitInterruptException;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:27   2019/8/26
 * @ClassName Service
 */
public class Service {
    public void testMethod(Object lock){
        synchronized (lock){
            try {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end wait()");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("出现异常，因为呈wait状态的线程被interrupt了");
            }
        }
    }
}
