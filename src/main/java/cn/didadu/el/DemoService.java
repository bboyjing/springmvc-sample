package cn.didadu.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jinggg on 16/4/18.
 */

@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another){
        this.another = another;
    }

}
