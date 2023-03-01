package D_static_singleInstance;

/**
 * @program: javasepromax
 * @description:理解懒汉单例的设计
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 20:24
 * @LastEditTime: 2023-02-12 20:24
 */

public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s2 == s1);
    }
}
