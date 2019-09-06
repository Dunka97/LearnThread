package com.dunka.chapter07.threadExceptionMove;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:11   2019/9/6
 * @ClassName StateUncaughtExceptionHandler
 */
public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
