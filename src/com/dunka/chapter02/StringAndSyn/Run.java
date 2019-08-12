package com.dunka.chapter02.StringAndSyn;


/**
 * @Author Dunka
 * @Description //TODO
 * @Date 12:04   2019/8/12
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
