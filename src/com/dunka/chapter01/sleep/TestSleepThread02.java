package com.dunka.chapter01.sleep;

/**
 * @Author Dunka
 * @Description 非Main线程调用线程
 * @Date 15:41   2019/8/7
 * @ClassName TestSleepThread
 */
public class TestSleepThread02 {
    public static void main(String[] args) {
        MySleepThread thread = new MySleepThread();
        System.out.println("begin="+System.currentTimeMillis());
        thread.start();
        System.out.println("end="+System.currentTimeMillis());
    }
}
