package com.dunka.chapter03.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @Author Dunka
 * @Description 通过管道进行线程通信：字节流
 * @Date 12:59   2019/8/28
 * @ClassName WriteData
 */
public class WriteData {
    public void writeMethod(PipedWriter outputStream){
        try {
            System.out.println("write:");
            for (int i = 0; i <300 ; i++) {
                String writeData = "" + (i + 1);
                outputStream.write(writeData);
                System.out.print(writeData);
            }
            System.out.println();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
