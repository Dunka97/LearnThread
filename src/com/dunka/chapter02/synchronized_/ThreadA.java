package com.dunka.chapter02.synchronized_;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:42   2019/8/8
 * @ClassName ThreadA
 */
public class ThreadA extends Thread{
    private MyObject myObject;
    public ThreadA(MyObject object){
        super();
        this.myObject = object;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
