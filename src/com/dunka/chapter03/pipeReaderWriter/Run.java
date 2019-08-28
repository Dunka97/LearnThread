package com.dunka.chapter03.pipeReaderWriter;

import java.io.*;

/**
 * @Author Dunka
 * @Description 通过管道进行线程通信：字符流 char[]
 * @Date 13:08   2019/8/28
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedReader inputStream = new PipedReader();
        PipedWriter outputStream = new PipedWriter();
        //连接输入管道和输出管道
        inputStream.connect(outputStream);
        ThreadRead read = new ThreadRead(readData,inputStream);
        read.start();
        Thread.sleep(5000);
        ThreadWrite write = new ThreadWrite(writeData,outputStream);
        write.start();
    }
}
