package D_util;

import java.util.Random;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-10 19:39
 * @LastEditTime: 2023-02-10 19:39
 */

public class createCaptcha1 {
    public static void main(String[] args) {
        String code = "";
        String data = "abcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTWXYZ0123456";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println(code);
    }
    public String r(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTWXYZ0123456";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }

    private String r1 = "abcdefghijklmnopqrstvwxyzABCDEFGHIJKLMNOPQRSTWXYZ0123456";

    public createCaptcha1() {
    }

    public createCaptcha1(String r1) {
        this.r1 = r1;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }
}
