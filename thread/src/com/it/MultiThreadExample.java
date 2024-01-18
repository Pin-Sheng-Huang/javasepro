package com.it;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 02:33
 * @LastEditTime: 2023-06-06 02:33
 */

public class MultiThreadExample {
    public static void main(String[] args) {
        // 创建Callable任务
        Callable<Integer> task = new MyCallable();

        // 创建FutureTask并关联Callable任务
        FutureTask<Integer> futureTask = new FutureTask<>(task);

        // 创建线程并启动
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // 获取任务执行结果
            int result = futureTask.get();
            System.out.println("任务执行结果：" + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // 自定义实现Callable接口的任务
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            // 在此处编写任务的具体逻辑
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        }
    }
    /*
    在上述示例中，MyCallable类实现了Callable<Integer>接口，定义了一个可以返回整数结果的任务。在call方法中编写了具体的任务逻辑，这里是计算1到100的和。

在MultiThreadExample类的main方法中，首先创建了一个Callable任务MyCallable，然后将其关联到FutureTask对象futureTask中。接着创建一个线程，并将futureTask作为参数传递给线程的构造函数。

最后，通过调用futureTask.get()方法获取任务执行的结果。该方法会阻塞当前线程直到任务执行完成并返回结果。

这样，通过使用Callable和FutureTask接口，可以在多线程中执行任务，并获得任务的返回结果。
    * * */
}
