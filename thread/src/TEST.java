/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-06-19 19:24
 * @LastEditTime: 2023-06-19 19:24
 */
/*        int number = 7;
//        for (int i = 1; i <= 9; i++) {
//            int result = number * i;
//            System.out.println(number + " * " + i + " = " + result);
//        }*/
public class TEST {
    public static void main(String[] args) {
        int x = 7;
        int[] ranarray = {1, 9, 2, 8, 3, 7, 4, 6, 5};

        for (int i : ranarray) {
            int rs = x * i;
            System.out.println(x + " X " + i + " = " + rs);
        }
        QQ(1,7);
    }
    public static int QQ(int x,int c){
        int rs = 0;
        for (int i = 0;i<=x&&x<=c+2; i++){
             rs = x*c;

            System.out.println(x+"X"+c+"="+rs);
            x++;
        }
        return rs;
    }
}
