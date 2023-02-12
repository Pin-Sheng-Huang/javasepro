package D_static_code;

import java.util.ArrayList;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 18:43
 * @LastEditTime: 2023-02-12 18:43
 */

public class StaticDemo1 {
    public static String schoolName;
    public static ArrayList<String> cards = new ArrayList<>();
    /**
     * 静态代码块,属于类,与类优先加载依次,自动触发执行
     * 可用于初始化静态资源
     */
    static {
        System.out.println("静态代码块被触发执行");
        schoolName = "致理科大";
        cards.add("1");
        cards.add("1");
    }

    public static void main(String[] args) {
        //理解静态代码块
        System.out.println("---main方法");
        System.out.println(schoolName);
        System.out.println(cards);
    }
}
