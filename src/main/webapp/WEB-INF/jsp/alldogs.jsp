<%@ page contentType="text/html"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${it.user}!</h1>
  <p>
    items in your cart :<br />
    <c:forEach var="item" items="${it.items}">
        ${item}<br />
    </c:forEach>
  </p>
</body>
</html>