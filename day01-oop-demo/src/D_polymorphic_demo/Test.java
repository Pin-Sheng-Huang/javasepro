package D_polymorphic_demo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-21 00:35
 * @LastEditTime: 2023-02-21 00:35
 */

public class Test {
    public static void main(String[] args) {
        //创建电脑对象
        Computer c = new Computer("苹果电脑");
        c.start();

        //创建鼠标 键盘对象
        Usb k = new Keyboard("苹果键盘");
        c.installUSB(k);
        Usb m = new Mouse("苹果滑鼠");
        c.installUSB(m);
    }
}
