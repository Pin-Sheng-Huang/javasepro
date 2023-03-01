package D_Lambda;

/**
 * @program: javasepromax
 * @description:lambda 只能简化接口终止有一个抽象方法的匿名内部类型式
 * @Creator: 阿昇
 * @CreateTime: 2023-03-02 00:51
 * @LastEditTime: 2023-03-02 00:51
 */

public class Demo1 {
    public static void main(String[] args) {
//        Swimming s1 =new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("林北游泳之神");
//            }
//        };
        //->
        Swimming s1 = () -> {System.out.println("林北游泳之神");};//lambda
        go(s1);

        System.out.println("---------------");

        go(()-> {System.out.println("阿昇游泳很开心");});//lambda
    }
    public static void go(Swimming s){
        System.out.println("START..");
        s.swim();
        System.out.println("FINISH");
    }
}
@FunctionalInterface //函数式接口,里面只能有一个抽象方法
interface Swimming{
    void swim();
}
