package cn.didadu.jsr250;

/**
 * Created by jinggg on 16/4/18.
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
