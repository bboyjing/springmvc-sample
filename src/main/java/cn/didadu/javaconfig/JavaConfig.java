package cn.didadu.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinggg on 16/4/18.
 */

@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    /**
     * 以下两个方法生成的bean是同一个
     * 而且两个同时存在的话是调用的有参方法生成的bean
     * @return
     */
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        System.out.println("from useFunctionService()");
        return useFunctionService;
    }
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        System.out.println("from useFunctionService(.....)");
        return useFunctionService;
    }

}
