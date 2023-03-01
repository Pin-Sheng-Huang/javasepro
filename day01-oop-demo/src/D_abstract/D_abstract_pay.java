package D_abstract;

import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 17:18
 * @LastEditTime: 2023-02-17 17:18
 */

public abstract class D_abstract_pay {
    private String name;
    private double balance;

    /**
     定义一个支付方法
     抽象方法不用定义方法体
     抽象类不可创建那个类的对象,除非继承那类的对象
     */
    public abstract void pay(double money);
    public static void QQ(){}
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }


}
