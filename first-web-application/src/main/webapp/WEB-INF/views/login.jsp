<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Login</title>
    </head>
    <body>
        <form action="/login.do" method="POST">
            <div>Enter your username <input type="text" name="username" /></div>
            <div>Password <input type="password" name="password" /></div>
            <input type="submit" value="login" />
        </form>
        <p>${message}</p>
    </body>
</html>
