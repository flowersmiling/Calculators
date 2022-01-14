<%-- 
    Document   : arithmeticcalculator
    Created on : 2022-1-13, 21:14:14
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="oper" value="+">&nbsp;<input type="submit" name="oper" value="-">&nbsp;<input type="submit" name="oper" value="*">&nbsp;<input type="submit" name="oper" value="%"><br>
            <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
