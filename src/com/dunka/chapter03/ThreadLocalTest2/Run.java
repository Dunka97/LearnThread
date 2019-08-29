package com.dunka.chapter03.ThreadLocalTest2;

import org.junit.Test;

/**
 * @Author Dunka
 * @Description 解决ThreadLocal默认值问题
 * @Date 10:21   2019/8/29
 * @ClassName Run
 */
public class Run {
    private static ThreadLocalInit init = new ThreadLocalInit();
    public static void main(String[] args) {
        if (init.get()==null){
            System.out.println("没有默认值");
        }else {
            System.out.println(init.get());
            System.out.println(init.get());
            System.out.println(init.get());
        }
    }
    @Test
    public void test() throws InterruptedException {
        /**
         * 再次验证了不同线程变量的隔离性
         */
        ThreadA a = new ThreadA();
        a.start();
        for (int i = 0; i < 15; i++) {
            System.out.println("Main get="+Tools.ext.get());
            Thread.sleep(200);
        }
    }

}
