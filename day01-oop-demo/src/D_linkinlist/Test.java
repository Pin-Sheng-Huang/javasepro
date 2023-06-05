package D_linkinlist;

import java.util.LinkedList;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-04 12:57
 * @LastEditTime: 2023-04-04 12:57
 */

public class Test {
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<>();
        x.add("第一颗");
        x.add("第二颗");
        x.add("第三颗");
        x.add("第四颗");
        System.out.println(x);
        while (x.size() > 0) {
            x.pop();//removefirst
            System.out.println(x);
            if(x.size() == 0){
                System.out.println("子弹已用完");
            }
        }


    }
}
class Test2{
    public static void main(String[] args) {
        LinkedList<String>x = new LinkedList<>();
        x.addLast("1");
        x.addLast("2");
        x.addLast("3");
        x.addLast("4");
        System.out.println(x);
    }

}
