package cn.didadu.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次 " + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 08 19 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 " + dataFormat.format(new Date()) + "执行");
    }
}
