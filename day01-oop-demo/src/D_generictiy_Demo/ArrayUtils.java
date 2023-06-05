package D_generictiy_Demo;

import java.util.Arrays;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 15:15
 * @LastEditTime: 2023-04-08 15:15
 */
// 定义一个泛型方法，用于交换数组中两个元素的位置
public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
 class Main1 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before swapping: " + Arrays.toString(numbers));
        ArrayUtils.swap(numbers, 0, 4);
        System.out.println("After swapping: " + Arrays.toString(numbers));
    }
}