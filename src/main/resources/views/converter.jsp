<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <meta content="text/html; charset=UTF-8" HTTP-EQUIV="Content-Type">
    <title>HttpMessageConverter Demo</title>
    </head>

    <body>

        <div id="resp"></div>
        <input type="button" onclick="req();" value="请求">
        <script src="assets/js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script>

            function req(){
                $.ajax({
                    url: "convert",
                    data: "1-zhangjing",
                    type: "POST",
                    contentType: "application/x-zhangjing",
                    success: function(data){
                        $("#resp").html(data);
                    }
                });
            }

        </script>

    </body>
</html>