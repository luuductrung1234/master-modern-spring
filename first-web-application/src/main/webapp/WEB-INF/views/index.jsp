<%@page import="java.util.Date"%> <%@ page language="java"
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Home</title>
    </head>
    <body>
        <p>${message}</p>
        <p>This is your first JSP</p>
        <% System.out.println("This is your first Scriptlet");
        System.out.println("your name is " + request.getParameter("name")); Date
        date = new Date();%>
        <div>Current date is <%=date%></div>
    </body>
</html>
