package threadSafe;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-06 23:48
 * @LastEditTime: 2023-06-06 23:48
 */

public class Account {
    private double accountMoney;//账户余额
    private String cardId;

    /**
     * A先生 B小姐
     * @param money
     */
    public void drawMoney(double money) {
        //获取谁来取钱
        String name = Thread.currentThread().getName();
        //同步代码块
        //A先生 B小姐
        // this == acc 共享账户
        synchronized (this) {
            if(this.accountMoney >= money) {
                //取前
                System.out.println(name + "取錢成功:" + money);
                //更新餘額
                this.accountMoney -= money;
                System.out.println(name +"取钱后剩"+this.accountMoney);
            }else{
                System.out.println(name + "余额不足");

            }
        }

    }
    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Account(double accountMoney, String cardId) {
        this.accountMoney = accountMoney;
        this.cardId = cardId;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }


}
