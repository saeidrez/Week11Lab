<%-- 
    Document   : forgot
    Created on : Nov 28, 2020, 10:15:07 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        Please enter your email address to retrieve your password.
        <br>
        <br>
             <form action="forgot" method="post">
            Email Address: <input type="text" name="email" value="${email}"><br>
        
            <input type="submit" value="Submit">
            ${message}
     
        </form>
       
    </body>
</html>
