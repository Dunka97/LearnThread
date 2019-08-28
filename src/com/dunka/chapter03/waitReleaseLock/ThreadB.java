package com.dunka.chapter03.waitReleaseLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:28   2019/8/26
 * @ClassName ThreadA
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
