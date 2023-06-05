package d_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 18:09
 * @LastEditTime: 2023-04-08 18:09
 */

public class HashExample {
    public static void main(String[] args) {
        // 创建一个 HashSet 对象
        Set<String> set = new HashSet<>();

        // 添加元素到 HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        // 遍历 HashSet
        System.out.println("HashSet 元素:");
        for (String item : set) {
            System.out.println(item);
        }

        // 判断元素是否存在于 HashSet
        System.out.println("HashSet 是否包含元素 'cherry': " + set.contains("cherry"));

        // 删除元素从 HashSet
        set.remove("banana");

        // 判断 HashSet 是否为空
        System.out.println("HashSet 是否为空: " + set.isEmpty());

        // 获取 HashSet 的大小
        System.out.println("HashSet 大小: " + set.size());

        // 清空 HashSet
        set.clear();

        // 判断 HashSet 是否为空
        System.out.println("HashSet 是否为空: " + set.isEmpty());
    }
}

class LinkedHashSetExample {
    public static void main(String[] args) {
        // 创建一个 LinkedHashSet 对象
        Set<String> set = new LinkedHashSet<>();

        // 添加元素到 LinkedHashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        // 遍历 LinkedHashSet
        System.out.println("LinkedHashSet 元素:");
        for (String item : set) {
            System.out.println(item);
        }

        // 判断元素是否存在于 LinkedHashSet
        System.out.println("LinkedHashSet 是否包含元素 'cherry': " + set.contains("cherry"));

        // 删除元素从 LinkedHashSet
        set.remove("banana");

        // 判断 LinkedHashSet 是否为空
        System.out.println("LinkedHashSet 是否为空: " + set.isEmpty());

        // 获取 LinkedHashSet 的大小
        System.out.println("LinkedHashSet 大小: " + set.size());

        // 清空 LinkedHashSet
        set.clear();

        // 判断 LinkedHashSet 是否为空
        System.out.println("LinkedHashSet 是否为空: " + set.isEmpty());
    }

    public static void main2(String[] args) {
        // 创建一个 TreeSet 对象
        Set<Integer> set = new TreeSet<>();

        // 添加元素到 TreeSet
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(10);

        // 遍历 TreeSet
        System.out.println("TreeSet 元素:");
        for (Integer item : set) {
            System.out.println(item);
        }

        // 判断元素是否存在于 TreeSet
        System.out.println("TreeSet 是否包含元素 8: " + set.contains(8));

        // 删除元素从 TreeSet
        set.remove(2);

        // 判断 TreeSet 是否为空
        System.out.println("TreeSet 是否为空: " + set.isEmpty());

        // 获取 TreeSet 的大小
        System.out.println("TreeSet 大小: " + set.size());

        // 清空 TreeSet
        set.clear();

        // 判断 TreeSet 是否为空
        System.out.println("TreeSet 是否为空: " + set.isEmpty());

    }
}

class MyNumber implements Comparable<MyNumber> {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyNumber o) {
        // 比较当前对象的值和传入对象的值
        // 返回负数表示当前对象小于传入对象
        // 返回正数表示当前对象大于传入对象
        // 返回0表示当前对象等于传入对象
        return Integer.compare(this.value, o.value);
    }

    public int getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        MyNumber num1 = new MyNumber(3);
        MyNumber num2 = new MyNumber(7);
        MyNumber num3 = new MyNumber(1);

        // 创建 TreeSet 对象，并将 MyNumber 对象添加进去
        TreeSet<MyNumber> set = new TreeSet<>();
        set.add(num1);
        set.add(num2);
        set.add(num3);

        // 遍历 TreeSet，按照自定义的比较规则输出排序结果
        for (MyNumber num : set) {
            System.out.println(num.getValue());
        }
    }
}
