package D_interface;

/**
 * 声明接口(是体现一种规范,规费一锭是公开)
 */
public interface interfaceDemo {
    //接口只可以定义抽象方法与常量,所以常量一定要初始化
    //常量
    public static final String NAME = "猛";

    //抽象方法
    //规范默认都是公开的,所以代码层面,public abstract 可以省去不写
    public abstract void name();
    void name1();
}
