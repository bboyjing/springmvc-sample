package cn.didadu.aop;

import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("this is add from DemoAnnotationService");
    }
}
