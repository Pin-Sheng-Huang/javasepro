package com.it;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-17 16:01
 * @LastEditTime: 2023-06-17 16:01
 */

public class testt {
    public static void main(String[] args) {
        try {
            // 创建ServerSocket对象，监听指定端口
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务器启动，等待客户端连接...");

            // 等待客户端连接
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端已连接");

            // 创建输入流和输出流
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // 读取客户端发送的消息并回复
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("客户端：" + message);
                out.println("服务器收到消息：" + message);
            }

            // 关闭连接
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Client {
    public static void main(String[] args) {
        try {
            System.out.println("啟動客戶端成功");
            // 创建Socket对象，指定服务器IP和端口
            Socket socket = new Socket("127.0.0.1", 9999);


            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            new ClientReaderThread(socket).start();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("說點啥麼");
                String response = sc.nextLine();
                ps.println("服务器：" + response);
                ps.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ClientReaderThread extends Thread{
    private Socket socket;

    public ClientReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = br.readLine())!= null){
            System.out.println(socket.getRemoteSocketAddress()+"收到消息, "+line);

        }
        } catch (IOException e) {
            System.out.println("服務端把你踢出～～～～");
        }
    }
}