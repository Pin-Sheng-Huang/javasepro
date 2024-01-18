package com.it;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-17 18:56
 * @LastEditTime: 2023-06-17 18:56
 */

/**ClientHandler類
 * *将每个客户端请求封装为一个独立的线程来处理，
 * * 可以提高服务器的并发处理能力，确保每个请求的及时响应，
 * * 并保障请求间的隔离性。这对于处理大量并发请求或需要及时响应的场景非常重要。
 */
public class ClientHandler extends Thread{
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            // 处理客户端请求
            // 读取客户端发送的请求数据
            // 处理请求逻辑
            // 发送响应给客户端
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("HTTP/1.1 200 OK");//協議類型和版本 響應成功的消息
            out.println("Content-Type: text/html;charset=UTF-8");//響應的數據類型：文本/網頁
            out.println();//必須發送個空行
            out.println("<html><body>");
            out.println("<h1>我是最牛的</h1>");
            out.println("</body></html>");

            // 关闭与客户端的连接
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class ServerWithThreadPool {
    public static void main(String[] args) {
        final int PORT = 8089;
        final int THREAD_POOL_SIZE = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("服务器已启动，等待客户端连接..." + PORT);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("新客户端连接成功：: " + socket.getInetAddress());

                // 使用线程池处理客户端请求
                ClientHandler clientHandler = new ClientHandler(socket);
                executorService.execute(clientHandler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}


/*class Main {
    public static void main(String[] args) {
        try {
            // 创建服务器套接字
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("服务器已启动，等待客户端连接...");

            // 循环监听客户端连接请求
            while (true) {
                // 接受客户端连接
                Socket clientSocket = serverSocket.accept();
                System.out.println("客户端连接成功：" + clientSocket.getInetAddress());

                // 创建新的线程处理客户端请求
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/