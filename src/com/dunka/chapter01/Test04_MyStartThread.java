package com.dunka.chapter01;

/**
 * @Author Dunka
 * @Description 了解线程启动顺序与start（）执行顺序无关
 * @Date 10:44   2019/8/7
 * @ClassName Test04_MyStartThread
 */
public class Test04_MyStartThread {
    public static void main(String[] args) {
        MyStartThread thread1 = new MyStartThread(1);
        MyStartThread thread2 = new MyStartThread(2);
        MyStartThread thread3 = new MyStartThread(3);
        MyStartThread thread4 = new MyStartThread(4);
        MyStartThread thread5 = new MyStartThread(5);
        MyStartThread thread6 = new MyStartThread(6);
        MyStartThread thread7 = new MyStartThread(7);
        MyStartThread thread8 = new MyStartThread(8);
        MyStartThread thread9 = new MyStartThread(9);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
