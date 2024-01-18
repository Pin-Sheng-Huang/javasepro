package redpocket_test;

import java.util.List;
import java.util.Random;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-28 12:56
 * @LastEditTime: 2023-06-28 12:56
 */

public class PeopleThread extends Thread{
    private List<Integer> moneys;
    private int totalMoney;
    public PeopleThread(List<Integer> moneys, String name) {
        super(name); //让线程抓到名字
        this.moneys = moneys;
    }

    private Random r = new Random();

    @Override
    public void run() {
        //100个线程来抢钱
        while (true){
            String name = Thread.currentThread().getName();
            synchronized (moneys){
                if(moneys.size() ==0){
                    break;
                }
                //取紅包的當前這個人
                int money = moneys.remove(r.nextInt(moneys.size()));
                System.out.println(name + "搶到："+money+"元");
                totalMoney +=money;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
    public PeopleThread(){

    }

}
