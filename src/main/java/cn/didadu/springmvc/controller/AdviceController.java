package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinggg on 16/4/22.
 */

@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSometing(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException("非常抱歉，参数有误/" + "来自@ModelAttribute" + msg);
    }

}
