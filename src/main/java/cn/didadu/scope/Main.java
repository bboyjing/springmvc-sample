package cn.didadu.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jinggg on 16/4/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletionService s1 = context.getBean(DemoSingletionService.class);
        DemoSingletionService s2 = context.getBean(DemoSingletionService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等" + s1.equals(s2));
        System.out.println("p1与p2是否相等" + p1.equals(p2));

    }

}
