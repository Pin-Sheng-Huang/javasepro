package redpocket_test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
需求：紅包遊戲,某企業有100名員工 共發出200個紅包與,其中小紅包到（1-30）元之間總佔比80％ 大紅刀（31-100）元總佔比20％
 */

public class Test {
    public static void main(String[] args) throws Exception{
   //红包进来
        List<Integer> moneys = getMoney();
        System.out.println(moneys);
        Collections.shuffle(moneys);
        System.out.println(moneys);


        //创建100个员工
        List<PeopleThread> peopleThreads = new ArrayList<>();
        for (int i = 1; i <=100; i++) {
            PeopleThread peopleThread = new PeopleThread(moneys,i +"号");
            peopleThreads.add(peopleThread);
            peopleThread.start();
        }

        //統計誰搶的多,將續排名
        for (PeopleThread peopleThread : peopleThreads) {
            peopleThread.join();
        }
        System.out.println("活动结束..........");
        AtomicInteger TotalMoneyFull = new AtomicInteger();
        peopleThreads.stream().sorted((p1,p2)->p2.getTotalMoney()-p1.getTotalMoney())
                .forEach(p ->{
                    System.out.println(p.getName()+"抢红包总计:"+p.getTotalMoney());
                    TotalMoneyFull.addAndGet(p.getTotalMoney());
                    //使用AtomicInteger类型是为了确保多线程环境下对变量的原子操作，保证线程安全性。
                });
        System.out.println("总计发放:"+TotalMoneyFull+"元");

    }

    public static List<Integer> getMoney() {
        //拿紅包進來
        List<Integer> moneys = new ArrayList<>();
        Random r = new Random();
        //按照權重發紅包
        for (int i = 0; i < 160; i++) {
            moneys.add(r.nextInt(30) + 1);//表示生成一个范围在 0 到 29 之间的随机整数 +1 =30
        }
        for (int i = 0; i < 40; i++) {
            moneys.add(r.nextInt(70) + 31);
        }
        return moneys;
    }
}
