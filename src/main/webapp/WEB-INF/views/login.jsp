<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
</head>
<body>
<header>
    <%@include file="header.jsp"%>
</header>

<section class="login-page">
    <h2>Zaloguj się</h2>
    <form:form action="/login" method="post">
        <div class="form-group">
            <input type="text" name="username" placeholder="Username" />
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Hasło" />
            <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
            <a href="register" class="btn btn--without-border">Załóż konto</a>
            <button class="btn" type="submit">Zaloguj się</button>
        </div>
        <%--        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
    </form:form>
</section>
<%@include file="footer.jsp"%>
<script src="<c:url value="resources/js/app.js"/>"></script>
</body>
</html>
