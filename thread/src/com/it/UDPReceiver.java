package com.it;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-15 15:57
 * @LastEditTime: 2023-06-15 15:57
 */

public class UDPReceiver {
    public static void main(String[] args) {
        try {
            System.out.println("服务端启动");
            // 创建接收端套接字，绑定指定的端口
            DatagramSocket socket = new DatagramSocket(8888);

            // 创建一个字节数组作为接收数据的缓冲区
            byte[] buffer = new byte[1024];

            // 创建一个DatagramPacket对象，用于接收数据
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

            // 接收数据
            socket.receive(packet);

            // 从接收到的数据包中提取数据并进行处理
            String receivedMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Message received: " + receivedMessage);
//            String rs = new String(buffer);
//            System.out.println(rs);
            // 关闭套接字
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
