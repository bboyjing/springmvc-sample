package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jinggg on 16/4/22.
 */

@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-zhangjing"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
        return obj;
    }
}
