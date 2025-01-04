<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%
    String name = (String) request.getAttribute("name");
%>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Welcome <%= name %></h1>
</body>
</html>
