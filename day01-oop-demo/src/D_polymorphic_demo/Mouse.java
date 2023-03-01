package D_polymorphic_demo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-21 00:36
 * @LastEditTime: 2023-02-21 00:36
 */

public class Mouse implements Usb {
    private String name;

    public Mouse(String name) {
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
        System.out.println("滑鼠连接成功");
    }

    public void click() {
        System.out.println("双激");
    }

    @Override
    public void unconnect() {
        System.out.println("滑鼠连接拔出");
    }
}
