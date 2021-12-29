<%--
  Created by IntelliJ IDEA.
  User: marie
  Date: 29/12/2021
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Weather</title>
</head>
<body>
<h1>Weather ( jsp )</h1>
<form method="post">
    <label for="country-select">Choose a pet:</label>

    <select name="countries" id="country-select">
        <option value="">--Please choose a country--</option>
        <option value="France">France</option>
        <option value="Allemagne">Allemagne</option>
        <option value="USA">USA</option>
        <option value="Taiwan">Taiwan</option>
    </select>
    <button type="submit">OK</button>
</form>
</body>
</html>
