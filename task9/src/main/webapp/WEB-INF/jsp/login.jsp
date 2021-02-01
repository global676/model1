<%--
  Created by IntelliJ IDEA.
  User: database
  Date: 27.10.2020
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <c:url var="css" value="css/style.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="${css}">
</head>
<body>
<c:url var="welcome" value="/welcome"/>
<c:url var="login" value="/login"/>
<c:url var="exit" value="/logout"/>
<spring:message code="label.passPlaceholder" var="passPlace"/>
<spring:message code="label.loginPlaceholder" var="loginPlace"/>
<!--Header-->
<%--<tags:header/>--%>
<!--Content-->

<div class="container-form-login">
    <a href="?lang=ru"><img src="css/img/Russia.png" class="localize"></a>
    <a href="?lang=en" ><img src="css/img/USA.png" class="localize"></a>
    <a href="${login}" class="logo">
        <div class="footer_title login-title">
            <span class="g gg"> G</span>
            <span class="ood">ood</span>
            <span class="S ss">S</span>
            <span class="oft">oft</span>
        </div>
    </a>
    <form:form action="login" modelAttribute="user" method="post">
        <form:input path="login" placeholder="${loginPlace}"/><br>
        <form:input path="password" placeholder="${passPlace}"/><br>
        <input type="text" name="message" value="${message}" class="mess" disabled><br>
        <form:button ><spring:message code="label.logInButton"/></form:button>
    </form:form>
<%--    <form action="login" method="POST" class="form-login" >--%>
<%--        <input type="text" name="pass" placeholder=""><br>--%>
<%--        --%>
<%--        <button type="submit"> </button>--%>
<%--    </form>--%>
<%--    <spring:message code="label.addUsers"/>--%>
</div>
<!--Footer-->
<%--<tags:footer/>--%>
</body>
</html>
