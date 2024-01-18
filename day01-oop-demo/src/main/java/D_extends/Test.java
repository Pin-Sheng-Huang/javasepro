package D_extends;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 12:08
 * @LastEditTime: 2023-02-15 12:08
 */

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.write();
        s.setAge(8989);
        System.out.println(s.getName()+s.getAge()+"岁");
        Teacher t = new Teacher();
        t.setName("帅哥昇");t.setAge(999);
        t.teach();
    }
}
