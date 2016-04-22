package cn.didadu.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jinggg on 16/4/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();

        context.close();
    }

}
