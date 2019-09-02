package com.dunka.chapter06.singleton_5;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:54   2019/9/2
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
