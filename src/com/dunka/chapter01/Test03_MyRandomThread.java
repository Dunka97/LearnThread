package com.dunka.chapter01;

/**
 * @Author Dunka
 * @Description 体现了线程调用的随机性
 * @Date 10:32   2019/8/7
 * @ClassName Test03_MyRandomThread
 */
public class Test03_MyRandomThread {
    public static void main(String[] args) {
        try {
            MyRandomThread myThread = new MyRandomThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i = 0; i <10 ; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName()+"i="+i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
