package D_Lambda;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-02 00:43
 * @LastEditTime: 2023-03-02 00:43
 */

public class Demo {
    public static void main(String[] args) {
        //使用lambda标准格式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑得快");
            }
        };
        a.run();


    }
}

abstract class Animal{
    public abstract void run();
}