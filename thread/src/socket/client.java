package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-16 20:37
 * @LastEditTime: 2023-06-16 20:37
 */
//socket 网络编程入门案例的客户端开发
public class client {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1"; // 服务器IP地址
        int serverPort = 9999; // 服务器端口号

        try {
            // 创建Socket对象，连接到服务器
            Socket sk = new Socket("127.0.0.1", 7777);
            // 获取输出流
            OutputStream os = sk.getOutputStream();
            //创建字符刘对象,用于读写数据
            PrintWriter ps = new PrintWriter(os, true);

            // 发送消息到服务器
            String message = "我是TCP客户端,要不约?!";
            ps.println(message);
            //刷新输出流的方法
            ps.flush();

            // 关闭连接(不建议关闭管道)
            //sk.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Server {
    public static void main(String[] args) {
        int port = 7777;  // 服务器端口号

        try {
            // 创建ServerSocket对象并监听指定端口
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务器启动，监听端口: " + port);

            // 接受客户端连接请求
            Socket socket = serverSocket.accept();
            System.out.println("接受到客户端连接，客户端地址: " + socket.getInetAddress());

            // 获取Socket的输入流
            InputStream inputStream = socket.getInputStream();

            // 读取客户端发送的数据
            byte[] buffer = new byte[1024];
            int length = inputStream.read(buffer);
            String message = new String(buffer, 0, length);
            System.out.println("接收到客户端的数据: " + message);

            // 关闭连接
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}