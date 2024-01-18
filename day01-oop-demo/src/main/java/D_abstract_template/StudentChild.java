package D_abstract_template;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 19:32
 * @LastEditTime: 2023-02-17 19:32
 */

public class StudentChild extends Student{
    private String who;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    //继承抽象方法 做返回
    @Override
    public String writeMain() {
        return "你老爸就是刘B";
    }
}
