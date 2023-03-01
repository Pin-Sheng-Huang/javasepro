package D_abstract_template;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 19:29
 * @LastEditTime: 2023-02-17 19:29
 */

public abstract class Student {
    /**
     * 声明模版方法
     */
    public final void write(){
        System.out.println("\t\t\t\tMY DAD");//主题
        System.out.println("你的DAD是怎,,说来听听");
        //正文,调用子类的writeMain 的方法
        System.out.println(writeMain());

        System.out.println("牛B老爸....");

    }

    public abstract String writeMain();//抽象方法
}
