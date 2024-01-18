package testschedule;

//import org.junit.Test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-19 20:09
 * @LastEditTime: 2023-07-19 20:09
 */

public class TEST {
    private Integer count = 0;

    public void TimerTest() {
        testTimer();
    }

    public void testTimer() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    //do Something
                    System.out.println(new Date().toString() + ": " + count);
                    count++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1000);
    }
}
