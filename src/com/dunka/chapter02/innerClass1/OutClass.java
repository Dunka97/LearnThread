package com.dunka.chapter02.innerClass1;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:08   2019/8/12
 * @ClassName OutClass
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i = 1; i <11 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public synchronized void method2(){
            for (int i = 1; i <20 ; i++) {
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
