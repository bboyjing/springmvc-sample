package cn.didadu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinggg on 16/4/21.
 */

/*@Controller
@RequestMapping("/")*/
public class HelloController {

    /**
     * 不包含业务逻辑的跳转可以在配置类中用以下方式跳转
     * registry.addViewController("/index").setViewName("/index");
     */
/*    @RequestMapping("/index")
    public String hello(){
        return "index";
    }*/
}
