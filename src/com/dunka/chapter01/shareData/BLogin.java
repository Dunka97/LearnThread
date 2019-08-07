package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:27   2019/8/7
 * @ClassName ALogin
 */
public class BLogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("b","bbbbb");
    }
}
