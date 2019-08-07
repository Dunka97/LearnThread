package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description 共享数据,线程安全
 * @Date 11:19   2019/8/7
 * @ClassName Run02
 */
public class Run03 {
    public static void main(String[] args) {
        MyThread03 thread = new MyThread03();
        Thread a = new Thread(thread,"A");
        Thread b = new Thread(thread,"B");
        Thread c = new Thread(thread,"C");
        Thread d = new Thread(thread,"D");
        Thread e = new Thread(thread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
