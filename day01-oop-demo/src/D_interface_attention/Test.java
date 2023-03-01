package D_interface_attention;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-19 15:21
 * @LastEditTime: 2023-02-19 15:21
 */

public class Test {
    //接口总结:接口不能创建对象(接口更加彻底抽象)
    //类不可调用接口的静态方法
}
//3.一个类继承了父类,同时又实现了接口,父类中和接口中有同名方法默认用父类的
interface A{
    static void test(){
        System.out.println("TEST");
    }
}

interface B{
    static void test(){
        System.out.println("TEST");
    }
}

class C implements A,B{
    public static void main(String[] args) {
        A.test();
    }
}
