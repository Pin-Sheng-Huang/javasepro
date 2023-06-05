package Map;

import java.util.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-11 23:47
 * @LastEditTime: 2023-04-11 23:47
 */

public class MapTest1 {
    public static void main(String[] args) {
        //1.把80个学生选择的数据拿进来
        String[] selects = {"A","B","C","D"};
        StringBuilder sb  = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);//BACBDDCDBBCBACABCAACCBDBCAABDDBDDABBBDACBDCCCBABACCBCCADCDDACADAABCCACCDDDDABADD
        //定义一个Map集合记录最终统计的结果 ,A=30 B=20 C=20 D=10
        Map<Character,Integer> infos = new HashMap<>();
        //遍历80个信息
        for (int i = 0; i < sb.length(); i++) {
            //提取当前选择的景点字符
            char ch = sb.charAt(i);
            //5.判断Map集合是否存在这个键
            if (infos.containsKey(ch)) {
                //让值+1
                infos.put(ch, infos.get(ch)+1);
            }else{
                infos.put(ch,1);

            }
        }
        System.out.println(infos);
    }
}
class Demo2{

    public static void main(String[] args) {
        // 创建一个Map<String, List<String>>对象
        Map<String, List<String>> map = new HashMap<>();

        // 添加键值对
        List<String> list1 = new ArrayList<>();
        list1.add("value1");
        list1.add("value2");
        map.put("key1", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("value3");
        list2.add("value4");
        map.put("key2", list2);

        // 创建不可变的Map
        Map<String, List<String>> immutableMap = Collections.unmodifiableMap(map);

        // 尝试修改不可变的Map
        // immutableMap.put("key3", new ArrayList<>()); // 抛出 UnsupportedOperationException
        // immutableMap.get("key1").add("value5"); // 抛出 UnsupportedOperationException

        // 获取键对应的值
        List<String> valuesForKey1 = immutableMap.get("key1");
        System.out.println("Values for key1: " + valuesForKey1);

        // 遍历Map
        System.out.println("Map entries:");
        for (Map.Entry<String, List<String>> entry : immutableMap.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key + ", Values: " + values);
        }

        // 判断Map是否包含指定键
        boolean containsKey = immutableMap.containsKey("key1");
        System.out.println("Contains key 'key1': " + containsKey);

        // 判断Map是否包含指定值
        boolean containsValue = immutableMap.containsValue(list2);
        System.out.println("Contains value 'list2': " + containsValue);

        // 获取Map的大小
        int size = immutableMap.size();
        System.out.println("Map size: " + size);

        // 判断Map是否为空
        boolean isEmpty = immutableMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);
    }

}


