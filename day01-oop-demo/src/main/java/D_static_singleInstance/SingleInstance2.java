package D_static_singleInstance;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 20:24
 * @LastEditTime: 2023-02-12 20:24
 */

public class SingleInstance2 {
    /**
     * 2.定义一个静态的成员变量
     * 只加载依次,只有一份
     * 注意:最好私有化,这样可以避免给别人挖坑
     */
    private static SingleInstance2 instance2;//不能new ,等到需要是再创建
    /**
     * 3.提宫一个方法,对外返回单例对象
     */
    public static SingleInstance2 getInstance(){
        if(instance2 == null){
            //第一次拿对象,此时要创建对象
            instance2 = new SingleInstance2();
        }
        return instance2;
    }
    /**
     *1. 私有构造器
     */
    private SingleInstance2(){

    }
}
