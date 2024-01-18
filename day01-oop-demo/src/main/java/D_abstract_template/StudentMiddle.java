package D_abstract_template;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 19:29
 * @LastEditTime: 2023-02-17 19:29
 */

public class StudentMiddle extends Student{
private String who;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {

        this.who = who;
    }

    @Override
    public String writeMain() {
        return "你老爸就是刘B 开车不看红绿灯~~";
    }
}
