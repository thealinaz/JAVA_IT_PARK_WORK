<%--
  Created by IntelliJ IDEA.
  User: Алина
  Date: 01.06.2017
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <th>Login</th>
        <th>Password</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Email</th>
    </tr>
    </thead>
    <c:forEach items="${requestScope.users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td><c:out value="${user.password}"/></td>
            <td><c:out value="${user.firstName}"/></td>
            <td><c:out value="${user.lastName}"/></td>
            <td><c:out value="${user.age}"/></td>
            <td><c:out value="${user.email}"/></td>
        </tr>
    </c:forEach>
</table>
<div class="form-style-8">
    <h2>Add user into system</h2>
    <form action="/users" method="post">
        <%--Как не передавать пароль методом Post?--%>
        <input type="text" name="name" placeholder="name" />
        <input type="text" name="login" placeholder="login" />
        <input type="text" name="password" placeholder="password" />
        <input type="text" name="firstName" placeholder="firstName" />
        <input type="text" name="lastName" placeholder="lastName" />
        <input type="text" name="age" placeholder="age" />
        <input type="text" name="email" placeholder="email" />
        <input type="submit" />
    </form>
</div>
</body>
</html>
