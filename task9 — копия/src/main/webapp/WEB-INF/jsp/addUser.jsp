<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 30.10.2020
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:message code="label.loginPlaceholder" var="loginPlace"/>
<spring:message code="label.passPlaceholder" var="passPlace"/>
<spring:message code="label.createButton" var="createBut"/>a
<html>
<head>
    <title>AddUser</title>
    <c:url var="css" value="css/style.css"/>
    <link rel="stylesheet" href="${css}">
</head>
<body>
<c:url var="welcome" value="/welcome"/>
<c:url var="loginServlet" value="/login"/>
<c:url var="exit" value="/logout"/>
<!--Header-->
<div class="container-form-login edit">
    <a href="${loginServlet}" class="logo">
        <div class="footer_title login-title">
            <span class="g gg"> G</span>
            <span class="ood">ood</span>
            <span class="S ss">S</span>
            <span class="oft">oft</span>
        </div>
    </a>
    <form:form method="post" modelAttribute="user" action="addUser">
        <form:input type="hidden" name="id" path="id"/>
        <form:input path="login" name="login" placeholder="${loginPlace}" />
        <form:input path="password" name="password" placeholder="${passPlace}" /><br>
        <c:forEach items="${role}" var="rol">
            <form:checkbox path="rolesId" value="${rol}"/>${rol.name}<br>
        </c:forEach>
<%--        <form:checkboxes path="rolesId" items="${role}" itemLabel="name" itemValue="id"/><br>--%>
        <form:button>${createBut}</form:button>
    </form:form>


</div>
<!--Footer-->

</body>
</html>
