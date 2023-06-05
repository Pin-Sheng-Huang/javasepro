package D_generictiy_Demo;

/**
 * @program: javasepromax
 * @description:定义一个泛型类 Pair，表示一对键值对
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 15:05
 * @LastEditTime: 2023-04-08 15:05
 */
//定义一个泛型类 Pair，表示一对键值对
public class KvPair<K,V> {
    private K key;
    private V value;

    public KvPair(K ket, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
class Main {
    public static void main(String[] args) {
        // 创建一个 Pair 对象，使用 Integer 作为 key 类型，String 作为 value 类型
        KvPair<Integer, String> pair = new KvPair<>(1, "One");
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}