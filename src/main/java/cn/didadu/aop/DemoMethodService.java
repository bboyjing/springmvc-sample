package cn.didadu.aop;

import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class DemoMethodService {

    public void add(){
        System.out.println("this is add from DemoMethodService");
    }

}
