package com.dunka.chapter01;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:43   2019/8/7
 * @ClassName MyStartThread
 */
public class MyStartThread extends Thread{
    private int i;
    public MyStartThread(int i){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }
}
