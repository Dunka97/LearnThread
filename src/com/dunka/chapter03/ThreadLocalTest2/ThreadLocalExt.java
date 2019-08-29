package com.dunka.chapter03.ThreadLocalTest2;

import java.util.Date;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:24   2019/8/29
 * @ClassName ThreadLocalExt
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
