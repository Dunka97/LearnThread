package com.dunka.chapter02.synStaticMethod;



/**
 * @Author Dunka
 * @Description //TODO
 * @Date 12:04   2019/8/12
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
