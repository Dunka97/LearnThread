package com.dunka.chapter03.notifyHoldLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:28   2019/8/26
 * @ClassName ThreadA
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
