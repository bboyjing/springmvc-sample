package cn.didadu.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jinggg on 16/4/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService1 = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService1.hashCode());
        UseFunctionService useFunctionService2 = context.getBean(UseFunctionService.class,context.getBean(FunctionService.class));
        System.out.println(useFunctionService2.hashCode());
        System.out.println(useFunctionService2.sayHello("java config"));
        context.close();
    }

}
