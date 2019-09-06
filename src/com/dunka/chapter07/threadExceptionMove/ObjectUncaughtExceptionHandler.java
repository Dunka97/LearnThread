package com.dunka.chapter07.threadExceptionMove;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:10   2019/9/6
 * @ClassName ObjectUncaughtExceptionHandler
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }
}
