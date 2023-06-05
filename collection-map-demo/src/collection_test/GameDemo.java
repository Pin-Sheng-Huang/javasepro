package collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-09 12:40
 * @LastEditTime: 2023-04-09 12:40
 */

public class GameDemo {
    /**
     * 1.定义一个静态的集合存储54张牌对象
     */
    public static List<Card> allCards = new ArrayList<>();//多态

    /**
     * 2.做牌；定义静态代码块储使牌数据
     */
    static{
        //3.定义点数:个数确定、类型确定、使用数据
        String[] sizes= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.花色 ♠ ♣ ♥ ♦
        String[] colors = {"♠", "♣", "♥", "♦"};
        //5.组合点数和花色
        int index = 0;//记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //封装成牌对象
                Card c= new Card(size,color,index);
                //存入集合容器
                allCards.add(c);
            }
        }
        //8.大小王存入籍和对象去X XX
        Card c1 = new Card("","X",++index);
        Card c2 = new Card("","XX",++index);
        Collections.addAll(allCards,c1,c2);//全部放进collections工具类
        System.out.println("新牌:"+allCards);
    }
    public static void main(String[] args) {
        //9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后:"+allCards);
        //10.发牌(定义三个玩家)
        List<Card>asheng = new ArrayList<>();
        List<Card>asheng1 = new ArrayList<>();
        List<Card>asheng2 = new ArrayList<>();
        //11.开始发牌[9♦, 3♣, J♦, 4♣, Q♥, 9♥,....
        for (int i = 0; i < allCards.size()-3; i++) {
            //先拿到当前牌对象
            Card c = allCards.get(i);
            //因为只有3人发第四张牌求馀 %3
            if(i %3 ==0){
                //请asheng接
                asheng.add(c);
            }else if (i % 3 ==1){
                asheng1.add(c);
            }else if (i % 3==2){
                asheng2.add(c);
            }
        }
        //12.拿到最后三张牌(截取成一个子集合)
        List<Card>lastThreeCards = allCards.subList(allCards.size() -3 , allCards.size());//51-53索引
        //13.给玩家做排序(从大到小)->自创个sort方法
        sortCard(asheng);
        sortCard(asheng1);
        sortCard(asheng2);
        //14.输出玩家的牌
        System.out.println("阿昇:"+asheng);
        System.out.println("阿昇1:"+asheng1);
        System.out.println("阿昇2:"+asheng2);
        System.out.println("最后三张:"+lastThreeCards);
    }

    /**
     *给牌 排序 (自定义方法)
     * @param cards
     */
    private static void sortCard(List<Card> cards) {
        //cards =[Q♣, 9♣, Q♦, 5♠, 4♦, ...
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex()- o1.getIndex();
            }
        });
    }
}