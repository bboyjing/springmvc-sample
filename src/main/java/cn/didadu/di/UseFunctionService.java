package cn.didadu.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
