package cn.didadu.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("I am from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("I am from production profile");
    }

}
