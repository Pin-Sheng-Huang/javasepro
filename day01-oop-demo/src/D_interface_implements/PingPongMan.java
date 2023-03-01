package D_interface_implements;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-19 13:03
 * @LastEditTime: 2023-02-19 13:03
 */

public class PingPongMan implements SportMan,Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name +"08就是中国狗狗");
    }

    @Override
    public void competition() {
        System.out.println(name+"比赛输了只能哭");
    }

    @Override
    public void rule() {
        System.out.println(name+"小狗狗必须守法");
    }
}
