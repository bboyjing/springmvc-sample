<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <meta content="text/html; charset=UTF-8" HTTP-EQUIV="Content-Type">
    <title>sevlet async support</title>
    </head>

    <body>
        <script src="assets/js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            function deferred(){
                $.get('defer', function (data) {
                   console.log(data);
                    deferred();
                });
            }
            deferred();
        </script>
    </body>
</html>