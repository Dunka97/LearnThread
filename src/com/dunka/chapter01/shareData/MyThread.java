package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:15   2019/8/7
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    private int count = 5;
    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println(this.getName()+" 计算 count="+count);
        }
    }
}
