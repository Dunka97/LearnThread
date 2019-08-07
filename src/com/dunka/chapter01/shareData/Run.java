package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description 不共享数据
 * @Date 11:17   2019/8/7
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
