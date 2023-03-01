package D_extends2;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-15 14:03
 * @LastEditTime: 2023-02-15 14:03
 */

/**
 * 方法重写
 */
public class Test {
    public static void main(String[] args) {
        NewPhone apple = new NewPhone();
        apple.call();
        apple.sMg();
    }
}

class Phone{
        public void call(){
            System.out.println("打电话");
        }
        public void sMg(){
            System.out.println("传讯息");
        }
}

class NewPhone extends Phone{
    @Override //重写校验,提高代码的可读性
    public void call(){
        super.call();
        System.out.println("使用视屏");
    }
    @Override
    public void sMg(){
        super.call();
        System.out.println("传影片");
    }
        }
