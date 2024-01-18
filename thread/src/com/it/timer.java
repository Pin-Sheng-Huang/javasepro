package com.it;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-13 14:34
 * @LastEditTime: 2023-06-13 14:34
 */

public class timer {
    public static void main(String[] args) {
        Timer timer = new Timer();

//        TimerTask task = new TimerTask() {
//            int count = 0;
//
//            @Override
//            public void run() {
//                count++;
//                System.out.println("时间计数: " + count);
//
//                // 指定条件下停止计时器
//                if (count == 10) {
//                    timer.cancel();
//                    System.out.println("时间停止.");
//                }
//            }
//        };

        // 延迟1秒后开始执行任务，每隔1秒执行一次
//        timer.schedule(task, 1000, 1000);

        timer.schedule(new TimerTask() {
            int countt = 1;

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行" + countt + "次--" + new Date());
                countt++;
                if (countt == 20) {
                    timer.cancel();
                    System.out.println("时间停止");

                }
            }
        }, 2000, 5000);

//        timer.scheduleAtFixedRate(task,2000,2000);
    }

}
class  ScheduledExecutorExample {
    public static void main(String[] args) {
        // 创建 ScheduledExecutorService 实例
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // 定义任务
        Runnable task = () -> {
            // 在这里编写需要定时执行的任务逻辑
            System.out.println("执行定时任务" + new Date());
        };

        // 延迟 5 秒后执行任务
        executor.schedule(task, 3, TimeUnit.SECONDS);

        // 每隔 1 秒执行一次任务，初始延迟 2 秒
        executor.scheduleAtFixedRate(task, 2, 1, TimeUnit.SECONDS);

        // 关闭 ScheduledExecutorService
        executor.shutdown();
    }

}
class IPAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            InetAddress x = InetAddress.getByName("www.baidu.com");
            InetAddress z = InetAddress.getByName("26.101.113.243");
            System.out.println(x.getHostAddress());
            String ipAddress = localHost.getHostAddress();
            System.out.println("本地主机的IP地址是：" + ipAddress);
            //判断是否通过 ,设定秒数
            System.out.println(z.isReachable(50000));
        } catch (UnknownHostException e) {
            System.out.println("无法获取本地主机的IP地址：" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class UdpExample {
    public static void main(String[] args) {
        int serverPort = 8888; // 服务器端口
        String serverIp = "127.0.0.1"; // 服务器IP地址

        try {
            // 创建UDP Socket
            DatagramSocket socket = new DatagramSocket();//DatagramSocket->接收端对象

            // 发送数据
            String message = "Hello, UDP Server!";
            InetAddress serverAddress = InetAddress.getByName(serverIp);
//            System.out.println(InetAddress.getLocalHost()+"__"+serverIp);
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);//DatagramPacket->数据包对象
            socket.send(sendPacket);
            System.out.println("Message sent: " + message);

            // 接收数据
            byte[] receiveData = "小傻瓜".getBytes(StandardCharsets.UTF_8);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length,InetAddress.getLocalHost(),8888);
            socket.receive(receivePacket);
            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String rs = new String(receiveData);
            System.out.println("Message received: " + receivedMessage);
            System.out.println("收到"+rs);

            // 关闭Socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class UDPServer {
        public static void main(String[] args) {
            try {
                // 创建接收端套接字，绑定指定的端口
                DatagramSocket socket = new DatagramSocket(8888);

                // 创建一个字节数组作为接收数据的缓冲区
                byte[] buffer = new byte[1024];

                // 创建一个DatagramPacket对象，用于接收数据
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                // 接收数据
                socket.receive(packet);

                // 从接收到的数据包中提取数据并进行处理
                String receivedMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Message received: " + receivedMessage);

                // 关闭套接字
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}