package D_Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-03-02 04:09
 * @LastEditTime: 2023-03-02 04:09
 */

public class Demo2 {
    public static void main(String[] args) {
        Integer [] ages = {12,1,154,18888,366};
        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//比较构造器 改变升降序 改变o1,o2参数
                return o1 - o2;//升序
            }
        });
        System.out.println(Arrays.toString(ages));
        System.out.println("------------");
        Integer [] ages1 = {12,1,154,18888,366};
        //有return语句不用血return
        Arrays.sort(ages1, (o2, o1) -> o1 - o2);//降序
        System.out.println(Arrays.toString(ages1));

        JFrame j = new JFrame("窗口");
        JButton jb = new JButton("按钮");
        //lambda进阶
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点我奶");
            }
        });
        jb.addActionListener((ActionEvent e)-> {System.out.println("点我奶头");});
        jb.addActionListener(e-> {System.out.println("点我奶奶头");});
        jb.addActionListener(e-> System.out.println("点我奶奶头"));

        j.add(jb);
        j.setSize(400,300);
        j.setVisible(true);
    }

}
