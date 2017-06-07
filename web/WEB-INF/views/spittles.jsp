<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
  <head>
    <title>Spittles</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value='/resources/style.css' />" >
  </head>
  <body>
    <h1>Welcome to Spittles</h1>
    <c:forEach items="${srList}" var="spittle">
      <c:out value="${spittle.username}"></c:out>
      <c:out value="${spittle.age}"></c:out>
    </c:forEach>
  <c:out value="${uu}">123</c:out>
  </body>
</html>