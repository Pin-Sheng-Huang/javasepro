package demo;
/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-30 15:27
 * @LastEditTime: 2023-06-30 15:27
 */

public class AssertionExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // 断言 x 大于 y
        assert x > y : "x 应该大于 y";

        // 断言调用方法返回的结果不为 null
        String result = getResult();

        assertNonNull(result);
        System.out.println("断言通过");
    }

    public static String getResult() {
        // 模拟返回结果
        return null;
    }

    private static void assertNonNull(Object obj) {
        assert obj != null : "结果不应该为 null";
    }
}
