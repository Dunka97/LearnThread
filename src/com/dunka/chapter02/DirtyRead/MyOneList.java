package com.dunka.chapter02.DirtyRead;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:39   2019/8/8
 * @ClassName MyOneList
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
