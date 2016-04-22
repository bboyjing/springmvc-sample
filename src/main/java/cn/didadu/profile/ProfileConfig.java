package cn.didadu.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by jinggg on 16/4/18.
 */
public class ProfileConfig {

    @Bean()
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from developement profile");
    }

    @Bean()
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }

}
