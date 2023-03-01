package D_extends;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 12:09
 * @LastEditTime: 2023-02-15 12:09
 */

/**
 * 学生类
 */
public class Student extends People{
    public void write(){
        setName("阿昇");
        System.out.println(getName()+"大哥在读书");
    }
}
