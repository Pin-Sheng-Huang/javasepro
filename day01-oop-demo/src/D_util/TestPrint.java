package D_util;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-10 19:49
 * @LastEditTime: 2023-02-10 19:49
 */

public class TestPrint {
    public static void main(String[] args) {
        //方法1
        System.out.println(createCaptcha.r(9));
        //方法2
        createCaptcha1 c1 = new createCaptcha1();
        Random r = new Random();
        int x = r.nextInt(c1.getR1().length());
        int n = 5;
        String code = "";
        for (int i = 0; i < 9 ; i++) {
            int index = r.nextInt(c1.getR1().length());
             code += c1.getR1().charAt(index);
        }

        System.out.println(code);
    }
}
