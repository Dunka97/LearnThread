package com.dunka.chapter03.notifyHoldLock;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:28   2019/8/26
 * @ClassName ThreadA
 */
public class synNotifyMethodThread extends Thread {
    private Object lock;

    public synNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }
    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
