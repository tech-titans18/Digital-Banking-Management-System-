<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Account Summary</title>
</head>
<body>
    <h1>Account Summary</h1>
    <c:forEach var="transaction" items="${transactions}">
        <p>${transaction.date} - ${transaction.amount}</p>
    </c:forEach>
</body>
</html>




