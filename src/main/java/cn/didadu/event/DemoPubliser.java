package cn.didadu.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by jinggg on 16/4/18.
 */

@Component
public class DemoPubliser {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

}
