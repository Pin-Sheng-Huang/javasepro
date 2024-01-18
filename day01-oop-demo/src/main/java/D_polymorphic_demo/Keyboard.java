package D_polymorphic_demo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-21 00:35
 * @LastEditTime: 2023-02-21 00:35
 */

public class Keyboard implements Usb{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("键盘连接电脑成功");
    }

    /**
     * 独有功能
     */
    public void keyDown(){
        System.out.println("敲6666");
    }
    @Override
    public void unconnect() {
        System.out.println("键盘连接电脑拔出");
    }
}
