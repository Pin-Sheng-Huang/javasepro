package com.it;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-15 15:56
 * @LastEditTime: 2023-06-15 15:56
 */

public class UDPSender {
    public static void main(String[] args) {
        try {
            System.out.println("==========客户端启动=========");
            // 创建发送端套接字
            DatagramSocket socket = new DatagramSocket();

            // 准备要发送的数据
            String message = "我是一直小小鸟!";
            byte[] sendData = message.getBytes();
            System.out.println("Message sent: " + message);
            // 设置接收方的IP地址和端口
            InetAddress receiverAddress = InetAddress.getByName("127.0.0.1");
            int receiverPort = 8888;

            // 创建一个DatagramPacket对象，包含要发送的数据和接收方的地址信息
            DatagramPacket packet = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort);

            // 发送数据
            socket.send(packet);

            // 关闭套接字
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
