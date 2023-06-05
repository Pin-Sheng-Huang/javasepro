package com.it;

/**
 * @program: javasepromax
 * @description:创建多线程方式一->继承Thread类实现
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 01:49
 * @LastEditTime: 2023-06-06 01:49
 */

public class ThreadDemo1 {
    public static void main(String[] args) {
     //3.new一个新线程对象
        Thread t = new MyThread();
        //4.调用start方法启动县城(执行的还是run方法)
        t.start();

        for (int i = 0; i <5 ; i++) {
            System.out.println("主线程执行输出:"+i);
        }
    }
}

/**
 * *定义县城继承thread 类
 */
class  MyThread extends Thread{
    /**
     * *重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("子线程执行输出:" + i);
        }
    }
}