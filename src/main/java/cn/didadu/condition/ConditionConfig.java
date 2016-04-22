package cn.didadu.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windosListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService(){
        return new MacListService();
    }

}
