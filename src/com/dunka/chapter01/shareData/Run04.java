package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description 共享数据
 * @Date 11:28   2019/8/7
 * @ClassName Run04
 */
public class Run04 {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        BLogin b = new BLogin();
        a.start();
        b.start();
    }
}
