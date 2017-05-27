<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.itpark.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/css/table-style.css"/>" rel="stylesheet">
    <link href="<c:url value="/css/input-style.css"/>" rel="stylesheet">
</head>
<body>
<%--<table>--%>
    <%--<% ArrayList<User> userList = (ArrayList<User>) request.getAttribute("users"); %>--%>
    <%--<% for (User user : userList) { %>--%>
    <%--<tr>--%>
        <%--<td><%=user.getId()%>--%>
        <%--</td>--%>
        <%--<td><%=user.getName()%>--%>
        <%--</td>--%>
        <%--<td><%=user.getAge()%>--%>
        <%--</td>--%>
    <%--</tr>--%>
    <%--<%}%>--%>
<%--</table>--%>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <c:forEach items="${requestScope.users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.age}"/></td>
        </tr>
    </c:forEach>
</table>
<div class="form-style-8">
    <h2>Add user into system</h2>
    <form action="/users" method="get">
        <input type="text" name="name" placeholder="name" />
        <input type="text" name="age" placeholder="age" />
        <input type="submit" />
    </form>
</div>
</body>
</html>
