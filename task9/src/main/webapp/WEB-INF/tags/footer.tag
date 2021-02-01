<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06.11.2020
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:url var="welcome" value="/welcome"/>
<c:url var="loginServlet" value="/login"/>
<c:url var="exit" value="/logout"/>
<%@tag pageEncoding="UTF-8"%>
<footer>
    <div class="container-footer">

        <a href="${loginServlet}" class="logo">
            <div class="footer_title">
                <span class="g"> G</span>
                <span class="ood">ood</span>
                <span class="S">S</span>
                <span class="oft">oft</span>
            </div>
        </a>

        <div class="footer-nav">
            <ul class="ul_nav">
                <a href="${welcome}">
                    <li class="li_nav"><spring:message code="label.usersMenu"/></li>
                </a>
                <a href="${exit}">
                    <li class="li_nav"><spring:message code="label.logOut"/></li>
                </a>
            </ul>

        </div>
    </div>
</footer>
