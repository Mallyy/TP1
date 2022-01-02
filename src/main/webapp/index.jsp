<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello, 3 servlets de test ci dessous" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<p>To invoke the another servlet click <a href="MyServlet">here</a></p>

<p>To invoke the simple weather Servlet click <a href="SimpleWeather">here</a></p>

<p>To invoke the jsp weather Servlet click <a href="JSPWeather">here</a></p>

<p>To invoke the jsp multilanguage weather Servlet click <a href="/JSPMultiLanguageWeather">here</a></p>

<p>To invoke the tagmlib weather Servlet click <a href="/TagLibMultiLanguageWeather">here</a></p>
</body>
</html>