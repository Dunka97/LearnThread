package com.dunka.chapter03.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Author Dunka
 * @Description 通过管道进行线程通信：字节流 byte[]
 * @Date 13:08   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();
        //连接输入管道和输出管道
        inputStream.connect(outputStream);
        ThreadRead read = new ThreadRead(readData,inputStream);
        read.start();
        Thread.sleep(5000);
        ThreadWrite write = new ThreadWrite(writeData,outputStream);
        write.start();
    }
}
