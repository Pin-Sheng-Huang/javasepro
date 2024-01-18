package threadSafe;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 23:53
 * @LastEditTime: 2023-06-06 23:53
 */

public class withDrawThread extends Thread {
    //接收处理账户对象
    private Account acc;//类型是Account类
    public withDrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //A和B取钱
        acc.drawMoney(100000);
    }
}
