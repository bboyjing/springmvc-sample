package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinggg on 16/4/22.
 */

@Controller
public class NormalController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }

}
