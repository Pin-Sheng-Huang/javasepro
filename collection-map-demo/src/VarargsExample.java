/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 19:33
 * @LastEditTime: 2023-04-08 19:33
 */

public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5); // 可传入任意数量的参数
        printStrings("hello", "world"); // 可传入任意数量的参数
    }

    // 接受可变数量的整数参数并打印
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("元数个数:"+numbers.length);
    }

    // 接受可变数量的字符串参数并打印
    public static void printStrings(String... strings) {
        System.out.print("Strings: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
