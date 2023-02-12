package D_static_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 19:28
 * @LastEditTime: 2023-02-12 19:28
 */

public class StaticTestPoker {
    /**
     * 定义一个静态集合,这样这个集合只有加载一个,因为当前房间只需要一副牌
     * @param args
     */
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     * 在程序真正运行main方法前,把54张牌放进去,后续游戏可以直接使用
     */
    static {
        //正式做排,放到集合中里
        //a.定义一个数组存储全部点数:类型确定了,个数确定了
        String [] sizes = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
        //b.定义一个数组存储花色
        String[] colors = {"♥","♦","♠","♣"};
        //c.遍历点数
        for (int i = 0; i < sizes.length; i++) {
            //size[i]
            //d.遍历花色
            for (int j = 0; j < colors.length; j++) {
                //color[j]
                //一张牌
                String card = sizes[i] + colors [j];
                cards.add(card);
            }
        }
        //e.单独加入大小王
        cards.add("★");
        cards.add("★_");
    }
    public static void main(String[] args) {
        Collections.shuffle(cards); //Collections在java中的集合进行洗牌
        //模拟游戏启动前,初始化54张牌数据
        System.out.println("新牌"+cards);

    }
}
