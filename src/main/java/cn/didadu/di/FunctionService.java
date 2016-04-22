package cn.didadu.di;

import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello " + word + " !";
    }

}
