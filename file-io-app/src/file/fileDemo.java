package file;

import java.io.File;
import java.util.Random;

/**
 * @program: javasepromax
 * @description:创建file对象定位操作系统的文件和文件夹
 * @Creator: 阿昇
 * @CreateTime: 2023-04-26 20:51
 * @LastEditTime: 2023-04-26 20:51
 */

public class fileDemo {
    public static void main(String[] args) {
        //創建file對象（指定文件绝对路徑）
        File f = new File("C:\\Users\\USER\\Pictures\\Camera Roll\\messageImage_1668497280595.jpg"); /*裡面 \\反斜槓是轉義字元*///->也可以/替代\\
        long f_Size = f.length();
        System.out.println(f_Size);

        //支持决定路径也支持想对路径(在工程下)
//        File f1 = new File("file-io-app/src/file/file.txt");
//        System.out.println(f1.exists());
//        System.out.println(f1.length());
// //     File f2 = new File("C:/Users/USER/Pictures/Camera Roll/TEST/TEST3");
//        File f2 = new File("C:/Users/USER/Pictures/Camera Roll/TEST/");
//        if(!f2.exists()){
//            System.out.println(f2.mkdirs());//创建目录(支持多级)
//        }else {
//            Random rand = new Random();
//            int randomNumber = rand.nextInt(9999);
//     f2 = new File("C:/Users/USER/Pictures/Camera Roll/TEST/TEST"+randomNumber);
//   //       System.out.println("false:"+f2+"路径下有同名");
//            System.out.println(randomNumber);
//            System.out.println(f2.mkdirs());

//        }
        File f2  = new File("C:/Users/USER/Pictures");
    File[] f3 = f2.listFiles();
        System.out.println(f3);
        for (File file : f3) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
