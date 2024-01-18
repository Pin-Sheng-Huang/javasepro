package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-17 15:53
 * @LastEditTime: 2023-06-17 15:53
 */

class Server1 {
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
            // 创建Socket对象，指定服务器IP和端口
            Socket socket = new Socket("127.0.0.1", 9999);

            // 创建输入流和输出流
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 向服务器发送消息并接收回复
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("說點啥麼");
                out.println(message);
                String response = in.readLine();
                System.out.println("服务器：" + response);
            }

            // 关闭连接
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
PrintWriter 和 BufferedReader 都是 Java 的 I/O 类，用于处理字符数据的输入和输出。它们有以下区别：

功能：PrintWriter 主要用于将格式化的文本数据写入输出流，而 BufferedReader 则用于从输入流中读取字符数据。

输出功能：PrintWriter 提供了方便的方法来打印各种数据类型的值，并自动进行格式化，如 print、println 等。它还提供了 printf 方法，用于格式化输出。另外，PrintWriter 还可以自动刷新输出缓冲区。
而 BufferedReader 只提供了读取字符数据的方法，如 read、readLine 等。

缓冲功能：PrintWriter 可以使用缓冲区提高输出性能，通过将数据先写入缓冲区，然后批量刷新到底层输出流中。而 BufferedReader 也可以使用缓冲区提高输入性能，通过一次读取多个字符，并将其存储在内部缓冲区中，减少对底层输入流的频繁读取。

关联流：PrintWriter 和 BufferedReader 都是字符流，它们需要与底层字节流进行关联。通常，可以通过将 PrintWriter 关联到一个 OutputStream，将 BufferedReader 关联到一个 Reader。

除了 PrintWriter 和 BufferedReader，Java 还提供了其他用于处理字符数据的 I/O 类，例如：

FileReader 和 FileWriter：用于读写字符文件。
StringReader 和 StringWriter：用于在内存中读写字符串数据。
CharArrayReader 和 CharArrayWriter：用于在内存中读写字符数组数据。
这些类提供了不同的功能和特性，可以根据具体需求选择适合的类来处理字符数据。*/