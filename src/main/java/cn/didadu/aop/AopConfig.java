package cn.didadu.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
@ComponentScan("cn.didadu.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
