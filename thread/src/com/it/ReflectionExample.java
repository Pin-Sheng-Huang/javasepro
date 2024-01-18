package com.it;

import java.lang.reflect.Field;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-21 20:02
 * @LastEditTime: 2023-06-21 20:02
 */

public class ReflectionExample {
    private String message;
    private String newField; // 添加新字段

    public ReflectionExample() {
        this.message = "哈啰反射!";
    }

    public static void main(String[] args) throws Exception {
        // 步骤1：获取类的Class对象
        Class<?> clazz = ReflectionExample.class;

        // 步骤2：操作类的信息
        // 创建对象实例
        ReflectionExample instance = (ReflectionExample) clazz.newInstance();

        // 获取并调用方法
        System.out.println("Original message: " + instance.getMessage());
        Field messageField = clazz.getDeclaredField("message");
        messageField.setAccessible(true);
        messageField.set(instance, "Modified message");
        System.out.println("Modified message: " + instance.getMessage());

        // 步骤3：动态修改类的结构
        // 添加新字段
        Field newField = clazz.getDeclaredField("newField");
        newField.setAccessible(true);
        newField.set(instance, "新字段");
        System.out.println("New field value: " + newField.get(instance));
    }

    public String getMessage() {
        return message;
    }
}