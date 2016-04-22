package cn.didadu.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置获得bean");
    }

}
