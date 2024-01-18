package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-26 19:22
 * @LastEditTime: 2023-06-26 19:22
 */

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 添加元素到 ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 获取 ArrayList 的大小
        int size = list.size();
        System.out.println("ArrayList 的大小: " + size);

        // 访问 ArrayList 的元素
        String firstElement = list.get(0);
        System.out.println("第一个元素: " + firstElement);

        // 修改 ArrayList 的元素
        list.set(1, "Mango");

        // 遍历 ArrayList
        System.out.println("遍历 ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }

        // 检查元素是否存在于 ArrayList
        boolean contains = list.contains("Apple");
        System.out.println("ArrayList 是否包含 Apple: " + contains);

        // 删除元素
        list.remove("Orange");

        // 清空 ArrayList
        list.clear();

        // 检查 ArrayList 是否为空
        boolean isEmpty = list.isEmpty();
        System.out.println("ArrayList 是否为空: " + isEmpty);
    }
}

