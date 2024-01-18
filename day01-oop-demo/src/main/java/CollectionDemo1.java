import java.util.*;
import java.util.function.Consumer;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-11 16:28
 * @LastEditTime: 2023-03-11 16:28
 */

public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序,有索引,可重复
        Collection list = new ArrayList();
        list.add("false");
        list.add("true");
        list.add("123");
        list.add(1234);
        System.out.println(list); //[false, true, 123, 1234]
        //----------
        //无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("false");
        list1.add("true");
        list1.add("123");
        list1.add(1234);
        System.out.println(list1);//[123, 1234, false, true]
        //------------------------
        Collection<String> list2 = new ArrayList<>();
        list2.add("123");
    }
}
class CollectionDemo2{ //使用for增强式
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java");
        c.add("python");
        c.add("QQ");
        c.add("阿昇");
        System.out.println(c);//[java, python, QQ, 阿昇]
        for (String ele :c){
            System.out.println(ele);
        }
        System.out.println("-------------");
        double[] scores = {100,02,59,46465};
        System.out.println(Arrays.toString(scores));//[100.0, 2.0, 46465.0]
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println(Arrays.toString(scores));
    }
}
class CollectionDemo3{//lambda 简化
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java");
        c.add("python");
        c.add("QQ");
        c.add("阿昇");
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        c.forEach (s -> System.out.println(s));

        c.forEach (System.out::println);
    }

}
