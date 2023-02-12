package D_static_test;

/**
 * @program: javasepromax
 * @description:練習完成數組類工具
 * @Creator: 阿昇
 * @CreateTime: 2023-02-12 15:14
 * @LastEditTime: 2023-02-12 15:14
 */

public class ArrayUtil {
    /**
     * 私有構造器
     */
    private ArrayUtil(){

    }
    /**
     * 工具方法,靜態方法
     */
    public static String toString(int[]arr){
        //1.一些校驗
        if(arr == null){
            return null;
        }
        //2.拼接內容並返回
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length -1 ? arr[i] : arr[i] + ", ");
        }
        result += "]";
        return result;
    }
}
