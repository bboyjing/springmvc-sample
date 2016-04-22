package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinggg on 16/4/22.
 */

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getJson", produces = {"application/json; charset=UTF-8"})
    public DemoObj getJson(DemoObj obj)
    {
        return new DemoObj(obj.getId(),obj.getName() + "yy");
    }

    @RequestMapping(value = "/getXml", produces = {"application/xml; charset=UTF-8"})
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId(),obj.getName() + "yy");
    }

}
