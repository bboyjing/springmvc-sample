package cn.didadu.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jinggg on 16/4/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        context.close();
    }

}
