package testschedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-19 19:50
 * @LastEditTime: 2023-07-19 19:50
 */

@Component
@EnableScheduling
@SpringBootApplication
public class schedule {

@Autowired
    private final ScheduleService scheduleService;
    private int count = 0;



    public schedule(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @Scheduled(cron = TaskConst.PLATFORM_ORDER_TASK_CRON)
    public void executeTask() {
        int result = scheduleService.test1(count);
        System.out.println(result + "：" + (new Date()).toString());
    }
}
