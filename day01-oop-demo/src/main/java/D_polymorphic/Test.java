package D_polymorphic;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-20 22:51
 * @LastEditTime: 2023-02-20 22:51
 */

public class Test {
    public static void main(String[] args) {

        //1.多肽形式: 父类类型 对象名称 = new 子类构造器;
        Animal a = new dog();//小范围对象 附给大范围对象
        a.run();//编译看左,运行看右边  //狗贼快
        System.out.println(a.name);//父类名
        go(a);
        Animal b = new turtles();
        turtles b1 = new turtles();
        b.run();
        //强转类型(原本b为父类类型,为了调用子类的方法或着变量)
        turtles b2 = (turtles) b;
        System.out.println(b.name);//对于变量的调用:编译看左,运行也看左 //父类名
        System.out.println(b1.name);//子类乌龟
        System.out.println(b2.name);//子类乌龟
        go(b);
        go(new dog());
        //自动类型转换
        Animal d = new dog();
    }
    public static void go(Animal a){
        System.out.println("开始..");
        a.run();
        System.out.println("结束..");
    }
}

abstract class Animal{
    public String name="父类名";
    abstract void run();
}

class dog extends Animal{
    public String name = "子类狗";
    @Override
    void run() {
        System.out.println("狗贼快");
    }
}

class turtles extends Animal{
    public String name = "子类乌龟";
    @Override
    void run() {
        System.out.println("龟龟贼慢");
    }
}

