package demo;

import java.util.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-27 16:02
 * @LastEditTime: 2023-06-27 16:02
 */

public class MapExample {
    public static void main(String[] args) {
        Map<String,Double>items = new HashMap<>();
        items.put("Apple", 2.99);
        items.put("Banana", 1.99);
        items.put("Orange", 3.49);
        items.put("Mango", 4.99);
        items.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry->System.out.println("最贵的物品是：" + entry.getKey() + "，价格为：" + entry.getValue()));
        System.out.println("--------------");
        items.forEach((key,value)-> System.out.println("物品"+key+",價格："+value));
        /*
        陈灌灌 CC,DD,DD
         */
        Map<String, List<String>> names = new HashMap<>();
// Add names and corresponding lists
        List<String> chenList = List.of("灌灌", "小陈");
        List<String> chenList2 = new ArrayList<>();
        Collections.addAll(chenList2,"CC","DD","FF");
        names.put("陈灌灌",chenList);
        names.put("陈灌灌1",chenList2);
        for (Map.Entry<String, List<String>> entry : names.entrySet()) {
            String name = entry.getKey();
            List<String> list = entry.getValue();
            System.out.println(name + ": " + list);
        }
        List<String> list = Arrays.asList("1","2","3");

    }
}
