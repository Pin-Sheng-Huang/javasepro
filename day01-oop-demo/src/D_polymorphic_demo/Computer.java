package D_polymorphic_demo;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-21 00:41
 * @LastEditTime: 2023-02-21 00:41
 */

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + "开机");
    }

    /**
     * 提供方法对接滑鼠与键盘
     */
    public void installUSB(Usb usb) {
        //多态,usb 可能为键盘也有可能为滑鼠
        usb.connect();
        if (usb instanceof Keyboard) {
            Keyboard k = (Keyboard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }

        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
