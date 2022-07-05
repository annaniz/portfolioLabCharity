<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<header>
    <nav class="container container--70">
        <ul class="nav--actions">
            <li>
                <div
                <sec:authorize access="isAuthenticated()">
                    <p>Zalogowany jako: <sec:authentication property="principal.username"/></p>
                    <p>Posiada role: <sec:authentication property="authorities"/></p>
                </sec:authorize>
                </div>
            </li>
            <li><a href="login" class="btn btn--small btn--without-border">Zaloguj</a></li>
            <li><a href="register" class="btn btn--small btn--highlighted">Załóż konto</a></li>
        </ul>

        <ul>
            <li><a href="/" class="btn btn--without-border active">Start</a></li>
            <li><a href="/#whatsAbout" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="/#aboutUs" class="btn btn--without-border">O nas</a></li>
            <li><a href="/#fundations" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="/form" class="btn btn--without-border">Przekaz dary</a></li>
            <li><a href="/#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
</header>