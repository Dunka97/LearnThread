package com.dunka.chapter07.stateTest3;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:52   2019/9/3
 * @ClassName MyService
 */
public class MyService {
    synchronized static public void serviceMethod(){
        try {
            System.out.println(Thread.currentThread().getName()+"进入了业务方法！");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
