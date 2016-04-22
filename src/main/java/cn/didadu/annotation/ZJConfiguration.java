package cn.didadu.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by jinggg on 16/4/18.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface ZJConfiguration {

    String[] value() default {};

}
