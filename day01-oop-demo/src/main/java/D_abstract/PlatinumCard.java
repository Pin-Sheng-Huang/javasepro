package D_abstract;

import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 17:21
 * @LastEditTime: 2023-02-17 17:21
 */

public class PlatinumCard extends D_abstract_pay{

    @Override
    public void pay(double money) {
        System.out.println("您当前消费"+money);
        System.out.println("当前余额为:"+getBalance());
        //优惠
        double rs = money * 0.85;
        System.out.println(getName()+"您是白金卡,您实际支付为:"+rs);
        //变更
        setBalance(getBalance()-rs);
    }
}
