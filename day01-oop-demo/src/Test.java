

import java.util.Scanner;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 18:15
 * @LastEditTime: 2023-02-15 18:15
 */

public class Test {
    class Test1{

    }



    public static void main(String[] args) throws Exception {
        int flag = 1;
        int x;
        Scanner sc = new Scanner(System.in);
        boolean primitive = int.class.isPrimitive();


        while(flag == 1) {
            System.out.println("請輸入第一個數字:");
            int i = sc.nextInt();

            System.out.println("請輸入第二個數字:");
            int i2 = sc.nextInt();

            int sum = i * i2;

            System.out.println("兩個數字相乘為:" + sum + "\n" + "--------------------------");


        }


    }
    public void run(){
        System.out.println("X");
    }

}
