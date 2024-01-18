package D_stringbuilder;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-26 04:22
 * @LastEditTime: 2023-02-26 04:22
 */

public class StringBuilderTest {
    public static void main(String[] args) {
        int [] arr1 = null;
        System.out.println(toString(arr1));

        int [] arr2 = {11,22,33};
        System.out.println(toString(arr2));
    }

    //定义方法接收任意整型数组,返回数组内容格式
    public static String toString(int [] arr){
        //拼接内容
        if(arr!= null){
            //拼接内容
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length-1 ?"": ", ");
            }
            sb.append("]!!!");
            return sb.toString();
        }else{
            return null;
        }
    }

}
