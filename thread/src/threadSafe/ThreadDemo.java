package threadSafe;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 23:48
 * @LastEditTime: 2023-06-06 23:48
 */

/**
 * 模拟取钱案例(安全问题)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //定义线程类 创赵一个账户类
        Account acc = new Account(100000,"ICBC-11");
        //2.定义线程类:创造两个县城对象,A和B
        new withDrawThread(acc,"A先生").start();
        new withDrawThread(acc,"B小姐").start();
    }
}
