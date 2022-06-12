<%--
  Created by IntelliJ IDEA.
  User: iwona-asus
  Date: 12.06.2022
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Strat od uzytkownika: ${param.start}<br>
    End od uzytkownika: ${param.end}<br>
    Start: ${start}<br>
    End: ${end}<br>
    <c:forEach begin="${start}" end="${end}" var="iteracja">
        <h3 style="color: magenta; cursor: pointer">Kolejny index: ${iteracja}</h3>
    </c:forEach>
</body>
</html>
