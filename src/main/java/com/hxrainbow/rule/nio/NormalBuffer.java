package com.hxrainbow.rule.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NormalBuffer {
    public static void main(String[] args) throws Exception {
        FileOutputStream out = new FileOutputStream("d:/out.txt");
        FileInputStream in = new FileInputStream("d:/in.txt");
        FileChannel outChannel = out.getChannel();
        FileChannel inChannel = in.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate( 1024 );
        while(true){
            buffer.clear();
            int r = inChannel.read( buffer );
            if (r == -1) {
                break;
            }
            buffer.flip();
            outChannel.write( buffer );
        }
    }
}
