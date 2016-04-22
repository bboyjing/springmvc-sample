package cn.didadu.springmvc.config.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jinggg on 16/4/22.
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mdelAndVier) throws  Exception{
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次的请求处理时间为：" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }

}
