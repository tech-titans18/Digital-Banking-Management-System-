<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bank Registration</title>
</head>
<body>
    <h1>Register New Account</h1>
    <form action="bank" method="post">
        Name: <input type="text" name="name"><br>
        Account Type: <input type="text" name="accountType"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>