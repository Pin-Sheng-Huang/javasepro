package D_Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-23 12:24
 * @LastEditTime: 2023-04-23 12:24
 */

public class StreamDemo {
    public static void main(String[] args) {
        /*Collection 集合获取流------------------------------*/
        Collection<String> list = new ArrayList<>();
        Stream<String> list_Stream = list.stream();
        /*map获取流------------------------------*/
        Map<String,Integer> map = new HashMap<>();
        /*键流*/
        Stream<String> mapKey = map.keySet().stream();
        /*值流*/
        Stream<Integer> mapValue = map.values().stream();
        //健值对流
        Stream<Map.Entry<String,Integer>> keyAndValueStream = map.entrySet().stream();/*用于返回一个包含键值对的 Set 视图。每个元素都是一个 Map.Entry 对象，包含键和对应的值。通过这个视图可以迭代并访问 Map 中的所有键值对。*/

        /*数组获取流------------------------------*/
        String[] x = {"XXX","YYY","XXZZ"};
        Stream<String> nameString = Arrays.stream(x);
        Stream<String> nameString2 = Stream.of(x);
    }
}
