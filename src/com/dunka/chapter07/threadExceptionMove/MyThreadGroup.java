package com.dunka.chapter07.threadExceptionMove;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:08   2019/9/6
 * @ClassName MyThreadGroup
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
