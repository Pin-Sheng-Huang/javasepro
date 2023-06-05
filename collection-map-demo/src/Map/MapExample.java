package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-09 14:45
 * @LastEditTime: 2023-04-09 14:45
 */

public class MapExample {
    public static void main(String[] args) {
        // 创建一个 HashMap 对象
        Map<String, Integer> map = new HashMap<>();

        // 添加键值对到 Map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 40);

        // 获取 Map 的大小
        System.out.println("Map 的大小: " + map.size());

        // 获取指定键的值
        System.out.println("键 'banana' 的值: " + map.get("banana"));

        // 检查 Map 是否包含指定键
        System.out.println("Map 是否包含键 'grape': " + map.containsKey("grape"));

        // 检查 Map 是否包含指定值
        System.out.println("Map 是否包含值 30: " + map.containsValue(30));
    // 获取 Map 的键的 Set 视图
        Set<String> keySet = map.keySet();

        // 遍历 Map 的键
        System.out.println("Map 的键:");
        for (String key : keySet) {
            System.out.println(key);
        }
        // 遍历 Map
        System.out.println("Map 的键值对:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 删除指定键的键值对
        map.remove("banana");

        // 清空 Map
        map.clear();

        // 检查 Map 是否为空
        System.out.println("Map 是否为空: " + map.isEmpty());

    }
}
