package cn.didadu.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by jinggg on 16/4/18.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
