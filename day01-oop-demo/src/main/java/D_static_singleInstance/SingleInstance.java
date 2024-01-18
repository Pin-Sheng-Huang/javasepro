package D_static_singleInstance;

/**
 * @program: javasepromax
 * @description:使用饿汉单例实现类
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 20:15
 * @LastEditTime: 2023-02-12 20:15
 */

public class SingleInstance {

    //饿汉单例是在获取对像前,对象已经提前准备好了一个
    //对象只能是一个,所以定义静态成员变量****
    public static SingleInstance instance = new SingleInstance();
    /**
     * 必须把构造器私有化
     */
    private  SingleInstance(){

    }
}
