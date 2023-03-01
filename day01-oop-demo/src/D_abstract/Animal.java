package D_abstract;

/**
 * @program: javasepromax
 * @description:抽象类
 * @Creator: 阿昇
 * @CreateTime: 2023-02-16 19:45
 * @LastEditTime: 2023-02-16 19:45
 */
//一个类中如果定义了抽象方法,这类必须声明成抽象类,否则会报错
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();
}
