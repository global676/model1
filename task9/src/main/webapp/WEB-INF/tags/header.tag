<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06.11.2020
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:url var="welcome" value="/welcome"/>
<c:url var="loginServlet" value="/login"/>
<c:url var="exit" value="/logout"/>
<%@tag pageEncoding="UTF-8"%>
<header>
    <span class="container-header">

       <a href="${loginServlet}" class="logo">
           <div class="title-logo">
               <span class="g"> G</span>
               <span class="ood">ood</span>
               <span class="S">S</span>
               <span class="oft">oft</span>
           </div></a>

        <ul class="ul">
            <a href="${welcome}" class="a-nav"><li><spring:message code="label.usersMenu"/> </li></a>
            <a href="${exit}" class="a-nav"><li><spring:message code="label.logOut"/></li></a>
        </ul>

    </span>
</header>