package D_static_test;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 15:20
 * @LastEditTime: 2023-02-12 15:20
 */

public class TestDemo {
    public static void main(String[] args) {
        int [] arr = null; //空地址
        int [] arr1 = {};  //空內容
        int [] arr2 = {12,3,55,44};//有內容

        System.out.println(ArrayUtil.toString(arr));
        System.out.println(ArrayUtil.toString(arr1));
        System.out.println(ArrayUtil.toString(arr2));

    }
}
