<%-- 
    Document   : agecalculator
    Created on : 2022-1-12, 21:54:07
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" name="nextage" value="Age next birthday"><br>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Caculator</a>
        </form>
    </body>
</html>
