package com.dunka.chapter02.DirtyRead;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:41   2019/8/8
 * @ClassName MyService
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data){
            try {
                synchronized (list){
                    if (list.getSize()<1) {
                        Thread.sleep(2000);//模拟从远程花费2秒取回数据
                        list.add(data);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return list;
    }
}
