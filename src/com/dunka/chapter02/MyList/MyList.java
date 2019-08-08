package com.dunka.chapter02.MyList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dunka
 * @Description 验证多个线程调用同一个方法是随机的
 * @Date 22:54   2019/8/8
 * @ClassName MyList
 */
public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String username){
        System.out.println("ThreadName = "+Thread.currentThread().getName()
        +"执行了add方法！");
        list.add(username);
        System.out.println("ThreadName = "+Thread.currentThread().getName()
                +"退出了add方法！");
    }
    synchronized public int getSize(){
        System.out.println("ThreadName = "+Thread.currentThread().getName()
                +"执行了getSize方法！");
        int size = list.size();
        System.out.println("ThreadName = "+Thread.currentThread().getName()
                +"退出了getSize方法！");
        return  size;
    }
}
