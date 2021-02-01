<%--
  Created by IntelliJ IDEA.
  User: database
  Date: 27.10.2020
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>Welcome</title>
    <c:url var="css" value="css/style.css"/>
    <link rel="stylesheet" href="${css}">
</head>
<body>
<c:url var="welcome" value="/welcome"/>
<c:url var="login" value="/login"/>
<c:url var="exit" value="/logout"/>
<c:url var="addUser" value="/addUser"/>
<c:url var="editPng" value="css/img/edit.png"/>
<c:url var="deletePng" value="css/img/delete.png"/>

<!--Header-->
<tags:header/>
<!--Content-->
<div class="container-content">
    <table>
        <tr>
            <th><spring:message code="label.idUsersTable"/> </th>
            <th><spring:message code="label.loginUsersTable"/></th>
            <th><spring:message code="label.passUsersTable"/></th>
            <th><spring:message code="label.RolesUsersTable"/></th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>

                <c:url var="edit" value="/addUser">
                    <c:param name="id" value="${user.id}"/>
                </c:url>
                <c:url var="delete" value="/delete">
                    <c:param name="id" value="${user.id}"/>
                </c:url>
                <td>
                    <a href="${edit}">
                        <img src="${editPng}"></a>
                    <a href="${delete}">
                        <img src="${deletePng}"></a>
                        ${user.id}
                </td>
                <td>
                    ${user.login}
                </td>
                <td>
                    <c:out value="${user.password}"/>
                </td>
                <td>
                    <c:forEach var="role" items="${user.roles}">
                    <c:out value="${role.name}"/>
                    </c:forEach>  </td>
                </tr>
        </c:forEach>
    </table>
    <a href="${addUser}" class="a-button">Add user</a>
    <a href="${exit}" class="a-button">Exit</a>
</div>
<!--Footer-->
<tags:footer/>

</body>
</html>
