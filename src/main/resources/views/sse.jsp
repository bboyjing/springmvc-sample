<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <meta content="text/html; charset=UTF-8" HTTP-EQUIV="Content-Type">
    <title>SSE Demo</title>
    </head>

    <body>

        <div id="msgFromPush"></div>
        <script src="assets/js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            if(!!window.EventSource){
                var source = new EventSource('push');
                s = '';
                source.addEventListener('message', function(e){
                    s += e.data + "<br/>";
                    $("#msgFromPush").html(s);
                });

                source.addEventListener('open', function(e){
                    console.log("连接打开。")
                }, false);

                source.addEventListener('error', function(e){
                    if(e.readyState == EventSource.CLOSED){
                        console.log("连接关闭。")
                    }else{
                        console.log(e.readyState);
                    }
                }, false);
          }else{
              alert("你的浏览器不支持SSE");
          }

        </script>
    </body>
</html>