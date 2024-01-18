package D_enum;

import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-16 19:23
 * @LastEditTime: 2023-02-16 19:23
 */

public class Test {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        while (true) {
            System.out.println("请输入:");
            int s = x.nextInt();
            switch (s) {
                case 1:
                    Season(Season.SPRING);
                    break;
                case 2:
                    Season(Season.SUMMER);
                    break;
                case 3:
                    Season(Season.AUTUMN);
                    break;
                case 4:
                    Season(Season.WINTER);
                    break;
            }
        }
    }

    public static void Season(Season s) {
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
