package D_extends;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 12:14
 * @LastEditTime: 2023-02-15 12:14
 */

public class Teacher extends People {



    public void teach() {
        //setName("老师");
        System.out.println(getName() + "在教书" + "他" + getAge() + "岁了");
    }
}
