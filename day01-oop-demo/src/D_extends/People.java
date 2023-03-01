package D_extends;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 12:08
 * @LastEditTime: 2023-02-15 12:08
 */

/**
 * 父类 人类
 */
public class People {
    private String name;
    private int age;

    public void queryClass(){
        System.out.println(name+"查看课表");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
