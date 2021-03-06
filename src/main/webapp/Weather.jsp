<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.*" %>
<%@ page import="org.nordeurope.j2ee.tp.Baey_Leclercq.beans.WeatherBean" %>
<%@ page import="java.util.Objects" %><%--
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
<form method="post" action="JSPWeather">
    <label for="country-select">Pays:</label>
    <select name="country" id="country-select">
        <option value="">--Please choose a country--</option>
        <option value="France">France</option>
        <option value="Allemagne">Allemagne</option>
        <option value="USA">USA</option>
        <option value="Taiwan">Taiwan</option>
    </select>
    <button type="submit">OK</button>
</form>

<p ${weather.selected == false ? 'hidden' : ''}> ${weather.country}: dans la capital du pays ,  ${weather.capital}, la température est de ${weather.temperature}</p>
<div style=\"clear:both\"></div>
<image style="float: left " ${weather.selected == false || weather == null ? 'hidden' : ''} src="GraphicWeather?country=${weather.country}">
</body>
</html>
