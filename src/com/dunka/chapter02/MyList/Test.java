package com.dunka.chapter02.MyList;

/**
 * @Author Dunka
 * @Description 同步块中的代码是同步的，但AB线程的执行却是异步的
 *
 *
 *
 * @Date 23:02   2019/8/8
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        MyThreadB b = new MyThreadB(myList);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
