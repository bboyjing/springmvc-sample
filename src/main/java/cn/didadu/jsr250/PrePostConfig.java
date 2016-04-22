package cn.didadu.jsr250;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

}
