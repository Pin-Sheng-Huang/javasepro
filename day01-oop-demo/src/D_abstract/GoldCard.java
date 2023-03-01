package D_abstract;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 17:25
 * @LastEditTime: 2023-02-17 17:25
 */

public class GoldCard extends D_abstract_pay{
    @Override
    public void pay(double money) {
        System.out.println("您当前消费"+money);
        System.out.println("您当前余额是" + getBalance()); //抓父类
        //优惠价
        double rs= money * 0.8;
        System.out.println(getName()+"您实际支付"+rs);
        //变更余额
        setBalance(getBalance() - rs);
    }
}
