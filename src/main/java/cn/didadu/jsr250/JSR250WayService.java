package cn.didadu.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by jinggg on 16/4/18.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jst250-destroy-method");
    }
}
