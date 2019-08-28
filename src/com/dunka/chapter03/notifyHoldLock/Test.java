package com.dunka.chapter03.notifyHoldLock;

/**
 * @Author Dunka
 * @Description 此实验说明，必须执行完notify()方法所在的同步synchronized()代码块后才释放锁
 * @Date 15:40   2019/8/26
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        NotifyThread thread = new NotifyThread(lock);
        thread.start();
        synNotifyMethodThread thread1 = new synNotifyMethodThread(lock);
        thread1.start();
    }
}
