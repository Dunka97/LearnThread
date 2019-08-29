package com.dunka.chapter03.ThreadLocalTest3;

import java.util.Date;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 10:30   2019/8/29
 * @ClassName InheritableThreadLocalExt
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
