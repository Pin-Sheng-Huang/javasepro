package junit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-18 20:27
 * @LastEditTime: 2023-06-18 20:27
 */

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 获取类的Class对象
        Class<Student> personClass = Student.class;

        // 获取类的名称
        String className = personClass.getName();
        System.out.println("类名: " + className);

        // 获取类的方法
        System.out.println("方法:");
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // 获取类的构造函数
        System.out.println("构造函数:");
        Constructor<?>[] constructors = personClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterTypes().length == 0) {
                System.out.println("无参构造函数: " + constructor.getName()+"====>"+constructor.getParameterCount());//constructor.getParameterCount()获取参数
            } else {
                System.out.println("有参构造函数: " + constructor.getName()+"====>"+constructor.getParameterCount());
            }
        }

        // 获取类的字段
        System.out.println("字段:");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}