package com.it;

import java.lang.annotation.Target;

/**
 * @program: javasepromax
 * @description:创建线程方式2
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 02:19
 * @LastEditTime: 2023-06-06 02:19
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建一个任务对象
        Runnable MyRun = new MyRunnable();
        //把任务对象交给Thread处理
        Thread t = new Thread(MyRun);//包Runnable的构造器
        //自动线成
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行输出:" + i);
        }
    }
}
/**
 * *定义一个线程任物类 实现Runnable接口
 *
 */
class MyRunnable implements Runnable{
    /**
     *重写rin方法,定义线程的执行任务
     */

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出:" + i);
        }
    }
}
