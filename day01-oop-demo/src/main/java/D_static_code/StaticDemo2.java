package D_static_code;

import java.util.ArrayList;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 18:43
 * @LastEditTime: 2023-02-12 18:43
 */

public class StaticDemo2 {
    private String name;//初始化实例资源

    public StaticDemo2() {
        System.out.println("无参构造器被触发执行");
    }

    /**
     * 实例代码块,慈static修饰,属于对象,每次建构对象时,都会触发依次执行
     * 作用:初始化实例资源(几乎没啥用到)
     * @param args
     */
    {
        name = "张三";
        System.out.println("实例代码块执行");


    }
    public static void main(String[] args) {
        //理解实例代码块
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println(s1.name);

    }
}
