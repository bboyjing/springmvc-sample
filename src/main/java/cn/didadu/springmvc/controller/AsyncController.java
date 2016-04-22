package cn.didadu.springmvc.controller;

import cn.didadu.springmvc.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by jinggg on 16/4/22.
 */

@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }

}
