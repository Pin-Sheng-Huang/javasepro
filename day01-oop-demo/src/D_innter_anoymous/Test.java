package D_innter_anoymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-25 03:55
 * @LastEditTime: 2023-02-25 03:55
 */

public class Test {
    public static void main(String[] args) {
        //创建窗口
        JFrame win = new JFrame("登入");
        JPanel p = new JPanel();
        win.add(p);

        //创建按钮对象
        JButton btn = new JButton("我好帅");

        //匿名内部类的使用(接口创对象)
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(win,"啊昇好帅");
            }
        });
        btn.addActionListener(q-> JOptionPane.showMessageDialog(win,"啊昇真的好帅"));

        //把按钮添加到穿口上展示
        p.add(btn);
        //展示
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
