package com.dunka.chapter02.exception;


import com.dunka.chapter02.synchronized_.ThreadA;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:49   2019/8/8
 * @ClassName Service
 */
public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()
            +"run beginTime="+System.currentTimeMillis());
            int i = 1;
            while (i==1){
                if ((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName= "+ Thread.currentThread().getName()
                    +"run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("ThreadB runTime = "+System.currentTimeMillis());
        }
    }
}
