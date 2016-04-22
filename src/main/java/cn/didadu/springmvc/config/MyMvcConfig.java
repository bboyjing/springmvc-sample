package cn.didadu.springmvc.config;

import cn.didadu.springmvc.config.interceptor.DemoInterceptor;
import cn.didadu.springmvc.config.messageconverter.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Created by jinggg on 16/4/21.
 */

@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("cn.didadu.springmvc")
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000000);
        return multipartResolver;
    }

    @Bean
    public MyMessageConverter myMessageConverter(){
        return new MyMessageConverter();
    }

    /**
     * 添加拦截
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(demoInterceptor());
    }

    /**
     * 继承WebMvcConfigurerAdapter修改相关配置
     * 直接访问静态文件
     * addResourceHandler对外暴露的访问路径
     * addResourceLocations文件放置的目录
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }

    /**
     * 添加纯粹的跳转路径
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/sse").setViewName("/sse");
        registry.addViewController("/async").setViewName("async");
    }

    /**
     * 不忽略请求中的.
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer){
        configurer.setUseSuffixPatternMatch(false);
    }

    /**
     * 添加一个自定义的HttpMessageConverter
     * 不会覆盖默认注册的HttpMessageConverter
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters){
        converters.add(myMessageConverter());
    }


}
