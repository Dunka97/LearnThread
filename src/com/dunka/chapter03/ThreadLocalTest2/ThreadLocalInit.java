package com.dunka.chapter03.ThreadLocalTest2;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:20   2019/8/29
 * @ClassName ThreadLocalInit
 */
public class ThreadLocalInit extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值";
    }
}
