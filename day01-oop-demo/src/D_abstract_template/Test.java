package D_abstract_template;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-17 19:28
 * @LastEditTime: 2023-02-17 19:28
 */

public class Test {
    public static void main(String[] args) {
        //理解模版方法模式
        StudentChild sc = new StudentChild();
        sc.write();
        sc.setWho("小学生");
        System.out.println(sc.getWho()+"敬上");
        StudentMiddle sm = new StudentMiddle();
        sm.write();
        sm.setWho("中学生");
        System.out.println(sm.getWho()+"敬上");
    }
}
