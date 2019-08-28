package com.dunka.chapter03.pipeReaderWriter;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:06   2019/8/28
 * @ClassName ThreadWrite
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter outputStream;

    public ThreadWrite(WriteData writeData, PipedWriter outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
