package com.dunka.chapter06.singleton_1;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:19   2019/9/2
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
