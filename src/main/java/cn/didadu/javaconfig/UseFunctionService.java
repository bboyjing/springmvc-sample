package cn.didadu.javaconfig;


/**
 * Created by jinggg on 16/4/18.
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
