package com.cupertino.b2b;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Jin Haojie
 * @date --
 */
public class Test {


    public static void main(String[] args) {

        try {
//            RandomAccessFile aFile = new RandomAccessFile("/jin/study/shell.txt", "rw");
//
//            FileChannel inChannel = aFile.getChannel();
//            ByteBuffer buf = ByteBuffer.allocate(48);
//
//            int bytesRead = inChannel.read(buf);
//            while (bytesRead != -1)
//
//            {
//                System.out.println("Read " + bytesRead);
//                buf.flip();
//                while (buf.hasRemaining()) {
//                    System.out.print((char) buf.get());
//                }
//                buf.clear();
//                bytesRead = inChannel.read(buf);
//            }
//            aFile.close();

            String connectString = "localhost:2181";

            RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
//            CuratorFramework _client = CuratorFrameworkFactory.newClient("localhost:2181", retryPolicy);

            CuratorFramework _client = CuratorFrameworkFactory.builder().connectString(connectString).sessionTimeoutMs(5000).retryPolicy(retryPolicy).namespace("dubbo").build();
            _client.start();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

