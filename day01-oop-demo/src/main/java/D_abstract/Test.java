package D_abstract;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-16 19:42
 * @LastEditTime: 2023-02-16 19:42
 */

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        //--D_abstract_pay
        GoldCard g = new GoldCard();
        g.setBalance(10000);
        g.setName("张渊风");

        //创建消费金额
        g.pay(300);
        System.out.println("剩余" + g.getBalance());

        PlatinumCard p = new PlatinumCard();
        p.setBalance(30000);
        p.setName("张无忌");

        p.pay(9000);
        System.out.println("您剩余"+p.getBalance());


        //--
    }


}
