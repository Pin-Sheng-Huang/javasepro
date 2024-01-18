package com.it.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

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
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请说:");
                String msg = sc.nextLine();
                if("exit".equals(msg)){
                    System.out.println("离线成功");
                    socket.close();
                    break;
                }

                // 准备要发送的数据
                String message = "我是一直小小鸟!";
                byte[] sendData = msg.getBytes();
//                System.out.println("Message sent: " + message);
                // 设置接收方的IP地址和端口
                InetAddress receiverAddress = InetAddress.getByName("127.0.0.1");
                int receiverPort = 9991;
                int receiverPort1 = 4443;
                // 创建一个DatagramPacket对象，包含要发送的数据和接收方的地址信息
                DatagramPacket packet = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort);
                DatagramPacket packet1 = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort1);
                // 发送数据
                socket.send(packet);
                socket.send(packet1);
                // 接收数据
//                byte[] receiveData = new byte[1024];
//                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//                socket.receive(receivePacket);
//                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
//                int receivedPort = receivePacket.getPort();
//                System.out.println("接收到来自端口号 " + receivedPort + " 的消息: " + receivedMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
