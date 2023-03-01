package D_stringbuilder;

/**
 * @program: javasepromax
 * @description:使用StringBuilder操作字符串
 * @Creator: 阿昇
 * @CreateTime: 2023-02-26 03:37
 * @LastEditTime: 2023-02-26 03:37
 */

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("p");
        sb.append("p");
        sb.append("l");
        sb.append("e");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("w").append("a").append("t").append("e").append("r");
        System.out.println(sb1);

        //反转
        sb1.reverse();
        System.out.println(sb1);
        //StringBuilder无法传值 只能转成toString 去传值
        String rs = sb1.toString();
        check(rs);

    }

    public static void check(String data ){
        System.out.println(data);
    }
}
