package com.it.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.SecureRandom;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-15 15:57
 * @LastEditTime: 2023-06-15 15:57
 */

public class UDPReceiver {
    public static void main(String[] args) {
        //多发多收
        try {
            System.out.println("服务端启动");
            // 创建接收端套接字，绑定指定的端口
            DatagramSocket socket = new DatagramSocket(4442);
            DatagramSocket socket1 = new DatagramSocket(9991);
            // 创建一个字节数组作为接收数据的缓冲区
            byte[] buffer = new byte[1024*64];

            // 创建一个DatagramPacket对象，用于接收数据
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 4442);
            DatagramPacket packet1 = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 9991);
            while (true) {
                // 接收数据
                socket.receive(packet);
                socket1.receive(packet1);
                int len = packet.getLength();
                String rs = new String(buffer,0,len);
                System.out.println("收到来自:"+packet.getAddress()+",对方端口:"+packet.getPort()+"的msg"+rs+"QQ4444");
                System.out.println("收到来自:"+packet1.getAddress()+",对方端口:"+packet1.getPort()+"的msg"+rs+"DatagramSocket==5555");
            }
//            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
