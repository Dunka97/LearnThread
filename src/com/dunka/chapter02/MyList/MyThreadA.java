package com.dunka.chapter02.MyList;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:59   2019/8/8
 * @ClassName MyThreadA
 */
public class MyThreadA extends Thread {
    private MyList list;
    public MyThreadA(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("ThreadA"+(i+1));
        }
    }
}
