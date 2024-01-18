package threadcommuication;

/**
 创建了一个共享的Message对象，该对象包含一个content字段和一个empty字段，用于存储消息和标识消息是否为空。Message类提供了read()和write()方法来读取和设置消息。

 Sender线程通过调用message.write()方法发送消息，并且在每次发送后等待一段时间。Receiver线程通过调用message.read()方法接收消息，当接收到结束标识"EOF"时停止接收。

 通过使用对象的wait()和notifyAll()方法，当消息为空时，接收线程进入等待状态；当消息被设置时，发送线程唤醒接收线程继续执行。

 这样，发送线程和接收线程之间就实现了基本的线程通
 */

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Message message = new Message();

        // 创建发送线程和接收线程
        Thread senderThread = new Thread(new Sender(message));
        Thread receiverThread = new Thread(new Receiver(message));

        // 启动线程
        senderThread.start();
        receiverThread.start();
    }
}

// 共享的消息类
class Message {
    private String content;
    private boolean empty = true;

    // 获取消息
    public synchronized String read() {
        // 当消息为空时，线程进入等待状态
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 读取消息
        empty = true;
        notifyAll();
        return content;
    }

    // 设置消息
    public synchronized void write(String content) {
        // 当消息不为空时，线程进入等待状态
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 设置消息
        empty = false;
        this.content = content;
        notifyAll();
    }
}

// 发送线程
class Sender implements Runnable {
    private Message message;

    public Sender(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = { "Hello", "World", "Goodbye" };

        for (String msg : messages) {
            message.write(msg); // 发送消息
            System.out.println("Sent: " + msg);

            try {
                Thread.sleep(1000); // 等待一段时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        message.write("EOF"); // 发送结束标识
    }
}

// 接收线程
class Receiver implements Runnable {
    private Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String receivedMessage = message.read(); // 接收消息

        while (!receivedMessage.equals("EOF")) {
            System.out.println("Received: " + receivedMessage);
            receivedMessage = message.read(); // 继续接收消息
        }
    }
}