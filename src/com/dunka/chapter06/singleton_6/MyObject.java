package com.dunka.chapter06.singleton_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:59   2019/9/2
 * @ClassName MyObject
 */
public enum MyObject {
    connectionFactory;
    private String connection;
    private MyObject(){
        connection = new String("Dunka");
    }
    public String getConnection(){
        return  connection;
    }
}
