package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinggg on 16/4/22.
 */

@RestController
public class MyRestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoService.saySomething();
    }

}
