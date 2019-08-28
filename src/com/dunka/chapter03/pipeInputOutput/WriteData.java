package com.dunka.chapter03.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Author Dunka
 * @Description 通过管道进行线程通信：字节流
 * @Date 12:59   2019/8/28
 * @ClassName WriteData
 */
public class WriteData {
    public void writeMethod(PipedOutputStream outputStream){
        try {
            System.out.println("write:");
            for (int i = 0; i <300 ; i++) {
                String writeData = "" + (i + 1);
                outputStream.write(writeData.getBytes());
                System.out.print(writeData);
            }
            System.out.println();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
