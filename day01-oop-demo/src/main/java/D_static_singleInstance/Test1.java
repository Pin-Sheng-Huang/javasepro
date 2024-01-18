package D_static_singleInstance;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 20:16
 * @LastEditTime: 2023-02-12 20:16
 */

public class Test1 {
    public static void main(String[] args) {
        //理解饿汉单例的设计步骤
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1 == s2);
    }
}
