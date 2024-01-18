//package com.it;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
///**
// * @program: javasepromax
// * @description:
// * @Creator: 阿昇
// * @CreateTime: 2023-06-21 20:44
// * @LastEditTime: 2023-06-21 20:44
// */
//
//public class TestReflect {
//    public static void main(String[] args) {
//        // 创建学生对象
//        Student student = createInstance(Student.class, "Alice", 20);
//        student.study();
//
//        // 创建老师对象
//        Teacher teacher = createInstance(Teacher.class, "Bob", 35);
//        teacher.teach();
//
//        // 调用学生的私有方法 sleep
//        invokePrivateMethod(student, "sleep");
//
//        // 获取学生的字段值
//        String studentName = getFieldValue(student, "name");
//        int studentAge = getFieldValue(student, "age");
//        System.out.println("Student: " + studentName + " - " + studentAge+"岁");
//
//        // 获取老师的字段值
//        String teacherName = getFieldValue(teacher, "name");
//        int teacherAge = getFieldValue(teacher, "age");
//        System.out.println("Teacher: " + teacherName + " - " + teacherAge+"岁");
//    }
//
//    private static <T> T createInstance(Class<T> clazz, String name, int age) {
//        try {
//            // 获取构造函数并创建对象
//            return clazz.getConstructor(String.class, int.class).newInstance(name, age);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
////通过反射调用对象的私有方法
//    private static void invokePrivateMethod(Object object, String methodName) {
//        try {
//            // 获取方法并调用
//            Method method = object.getClass().getDeclaredMethod(methodName);//抓到方法名
//            method.setAccessible(true);
//            method.invoke(object);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static <T> T getFieldValue(Object object, String fieldName) {
//        try {
//            // 获取字段并获取值
//            Field field = object.getClass().getDeclaredField(fieldName);
//            field.setAccessible(true);
//            return (T) field.get(object);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
//
//class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void study() {
//        System.out.println(name + " is studying.");
//    }
//
//    private void sleep() {
//        System.out.println(name + " is sleeping.");
//    }
//
//}
//class Teacher{
//    private String name;
//    private int age;
//
//    public Teacher(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void teach() {
//        System.out.println(name + " is teaching.");
//    }
//
//}
///*
//定义了一个学生类（Student）和一个老师类（Teacher）。通过反射框架的方法，可以创建学生对象和老师对象，调用它们的方法，以及获取它们的字段值。
//
//通过调用createInstance方法，传入类对象和构造函数的参数，可以使用反射创建相应的对象。
//
//通过调用invokePrivateMethod方法，传入对象和方法名，可以使用反射调用对象的私有方法。
//
//通过调用getFieldValue方法，传入对象和字段名，可以使用反射获取对象的字段值。
//* * * */