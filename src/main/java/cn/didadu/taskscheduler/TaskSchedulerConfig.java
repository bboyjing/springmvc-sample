package cn.didadu.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
@ComponentScan("cn.didadu.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
