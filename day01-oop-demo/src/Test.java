

import java.util.*;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 18:15
 * @LastEditTime: 2023-02-15 18:15
 */

public class Test {




    public static void main(String[] args) throws Exception {

        int flag = 1;
        int x;
        Scanner sc = new Scanner(System.in);
        boolean primitive = int.class.isPrimitive();


        while(flag == 1) {
            System.out.println("請輸入第一個數字:");
            int i = sc.nextInt();

            System.out.println("請輸入第二個數字:");
            int i2 = sc.nextInt();

            int sum = i * i2;

            System.out.println("兩個數字相乘為:" + sum + "\n" + "--------------------------");


        }
    }
    public void run(){
        System.out.println("X");
    }

}

class Test1{
    public static void main(String[] args) {
        Set<String> x = new HashSet<>();
        x.add("apple");
        x.add("banana");
        boolean containsApple = x.contains("apple");
        System.out.println(containsApple);
        int c = 0;
        int d = x.size();
        for(String e : x){

            if(x.size() > c) {
                System.out.print(e + ",");
            }else if(x.size() < c){
                System.out.print(e);
            }
            d--;
            c++;
        }
    }

}

class Test2{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        // 判断元素是否存在
        boolean containsApple = set.contains("apple");
        System.out.println(containsApple);

        // 获取 Set 的大小
        int size = set.size();
        System.out.println(size);

        // 输出 Set 中所有元素
        StringBuilder sb = new StringBuilder();
        for (String element : set) {
            sb.append(element).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

        // 删除元素
        set.remove("banana");
        System.out.println(set);
        // 清空 Set
        set.clear();
        System.out.println(set);
    }


}
