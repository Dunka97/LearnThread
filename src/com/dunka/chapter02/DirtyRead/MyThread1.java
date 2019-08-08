package com.dunka.chapter02.DirtyRead;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:43   2019/8/8
 * @ClassName MyThread1
 */
public class MyThread1 extends Thread{
    private MyOneList list;
    public MyThread1(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list,"A");
    }
}
