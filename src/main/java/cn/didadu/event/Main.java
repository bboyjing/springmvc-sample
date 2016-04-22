package cn.didadu.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jinggg on 16/4/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPubliser demoPubliser = context.getBean(DemoPubliser.class);
        demoPubliser.publish("hello application event");

        context.close();
    }
}
