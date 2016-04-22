package cn.didadu.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by jinggg on 16/4/18.
 */
public class DemoEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
