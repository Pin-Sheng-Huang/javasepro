package D_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-02-27 01:16
 * @LastEditTime: 2023-02-27 01:16
 */

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date d = new Date();
        System.out.println(d);
        //格式化日其
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss EEE a");
        String rs = sdf.format(d);
        System.out.println(rs);

        //格式化时间毫秒直
        //需求:请问121秒后的时间是多少
        long time = System.currentTimeMillis()+121*1000;
        System.out.println(time);
        String rs2 = sdf.format(time);
        System.out.println(rs2);

        System.out.println("----------解析时间-------");
        //学会使用simpledateformat 解析字符串成为日其对象
        //假设2021年08月06日 11:11:11 往后两天14小时49分06秒时间是多少
        String dateStr = "2021年08月06日 11:11:11";

        //把字符时间解析成日其对象(重点)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf1.parse(dateStr);
        System.out.println(date);
        System.out.println("假设"+sdf1.format(date.getTime()));
        //往后走两天14小时49分06秒
        long time1 = date.getTime() +(2L* 24*60*60 + 14*60*60 + 49*60 + 6)*1000;

        System.out.println(time1);
        //格式化这时间毫秒值就是这结果
        System.out.println(sdf1.format(time1));
    }
}
