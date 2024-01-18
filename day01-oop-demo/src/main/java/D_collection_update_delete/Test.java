package D_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-04 13:43
 * @LastEditTime: 2023-04-04 13:43
 */

public class Test {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        System.out.println(list);
        //删除全部java信息
        //迭代器删除
        Iterator<String>it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if("java".equals(ele)){
                //list.remove("java");  //使用会报错
                it.remove();//使用迭代器删除当前所在元素,并且不会后移 类似于i--
            }
        }
        //解决方案2
        for (int i= list.size()-1; i>=0; i--) {
            String ele = list.get(i);
            if("java2".equals(ele)){
                list.remove("java2");
            }
        }
        System.out.println(".."+list);

        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if("java3".equals(ele)){
                list.remove("java3");
                i--;
            }

        }
        System.out.println(list);
    }
}
