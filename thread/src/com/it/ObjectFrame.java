package com.it;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-22 12:56
 * @LastEditTime: 2023-06-22 12:56
 */

/**
 * 实现步骤:
 * 1.定义一个方法,可以接收任意对象。
 * 2.每收到一个对象后,使用反射获取该对象的Class对象,然后获取全部的成员变量
 * 3.遍历成员变量,然后提取成员变量在该对象中的具体值
 * 4.把成员变量名和其值,写楚文件中去即可
 */
public class ObjectFrame {
    //目标 保存任意对象的字段和其数据到文件中去
    public static void saveObjec(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("thread\\src\\objectFrame.txt",true));
        //obj任意对象,到底有多少疙字段要保存
        Class c = obj.getClass();
        String cName = c.getSimpleName();//拿到类名信息
        ps.println("------------->"+cName);//建议先打印出来
        //2.从这类中提取全部的成员变量
        Field [] fields = c.getDeclaredFields();
        //3.遍历每个成员变量
        for (Field field : fields) {
            //4.拿到成员变量的名字
            String name = field.getName();
            //5.拿到这个成员变量在对象中的数据
            field.setAccessible(true);//选true禁止检查访问控制(在外面也可以访问私有的成员变量)
            Object value = field.get(obj);
            //往文件中保存(创建打印流) PrintStream
            ps.println(name+"="+value);
        }
            ps.close();
    }
}
class StudentDemo{
    private String name;
    private int age;
    private char sex;
    private double height;
    private String hobby;

    public StudentDemo() {
    }

    public StudentDemo(String name, int age, char sex, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.hobby = hobby;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
class TeacherDemo{
    private String name;
    private double salary;

    public TeacherDemo() {
    }

    public TeacherDemo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeacherDemo{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TestFrame{

    @Test
    public static void main(String[] args) throws Exception {
        StudentDemo s1 = new StudentDemo("帅哥啊昇",45,'男',186,"打手枪");
        TeacherDemo t1 = new TeacherDemo("陈老师",10000000000000.0);

        //需求把任意对象的字段名和其对应的直等信息,保存到文件中
        ObjectFrame.saveObjec(s1);
        ObjectFrame.saveObjec(t1);
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "";
    int priority() default 0;
}
