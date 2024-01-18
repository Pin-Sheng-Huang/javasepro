package interfaceDemo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-25 15:51
 * @LastEditTime: 2023-06-25 15:51
 */

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name+"正在唱:"+name);
        return "割韭菜啰~";
    }
    public void dance(){
        System.out.println(this.name+"随便跳舞片甲片甲");

    }
}
