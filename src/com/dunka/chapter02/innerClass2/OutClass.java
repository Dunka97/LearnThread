package com.dunka.chapter02.innerClass2;

/**
 * @Author Dunka
 * @Description 内置类与同步
 * @Date 16:48   2019/8/12
 * @ClassName OutClass
 */
public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 class2){
            String threadName = Thread.currentThread().getName();
            synchronized (class2){
                System.out.println(threadName+"进入InnerClass1的method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i="+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName+"离开InnerClass1的method1方法");
            }
        }
        public synchronized void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"进入InnerClass1的method2方法");
            for (int i = 0; i < 10; i++) {
                System.out.println("j="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+"离开InnerClass1的method2方法");
        }
    }
    static class InnerClass2{
        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"进入InnerClass2的method1方法");
            for (int i = 0; i < 10; i++) {
                System.out.println("k="+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+"离开InnerClass2的method1方法");
            }
        }
}

