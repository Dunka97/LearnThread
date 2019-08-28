package com.dunka.chapter03.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:06   2019/8/28
 * @ClassName ThreadWrite
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
