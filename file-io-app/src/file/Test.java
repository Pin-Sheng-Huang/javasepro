package file;

import java.util.logging.Logger;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-28 14:09
 * @LastEditTime: 2023-04-28 14:09
 */

public class Test {
    public static void main(String[] args) {
//    args    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        System.out.println(f(6));

    }
    public static int f(int n){
        if(n ==1){
            return 1;
        }else{
            return n * f(n-1);//

        }
    }
}
