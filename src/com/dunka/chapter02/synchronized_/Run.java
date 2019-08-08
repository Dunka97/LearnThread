package com.dunka.chapter02.synchronized_;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:44   2019/8/8
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
