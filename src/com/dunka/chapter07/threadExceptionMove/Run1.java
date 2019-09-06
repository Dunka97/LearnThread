package com.dunka.chapter07.threadExceptionMove;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:37   2019/9/6
 * @ClassName Run1
 */
public class Run1 {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
////        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
//        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
//        myThread.start();
//    }
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group,"我的线程");
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
//        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
