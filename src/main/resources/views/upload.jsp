<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

    <head>
        <meta content="text/html; charset=UTF-8" HTTP-EQUIV="Content-Type">
    <title>upload page</title>
    </head>

    <body>

       <div>
           <form action="upload" enctype="multipart/form-data" method="post">
               <input type="file" name="file" /><br/>
               <input type="submit" value="上传" />
           </form>
       </div>

    </body>
</html>