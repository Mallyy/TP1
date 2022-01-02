<%@ page import="java.util.Objects" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: vinci
  Date: 02/01/2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="WeatherTL" uri="/WEB-INF/tlds/tp.tld"%>
<html>
<head>
    <title>Wi18nWeatherTagLibeather-Tld</title>
</head>
<body>
<WeatherTL:i18nWeather lang='<%=request.getParameter("lang")%>' />


<%
    Locale currentLocale = new Locale(request.getAttribute("lang").toString());
    ResourceBundle resources = ResourceBundle.getBundle("imt.nordeurope.j2ee.tp.Baey_Leclercq.resources.tagWeather", currentLocale);
%>

<h1>Weather ( tld )</h1>
<div style="alignment: right">
    <a href="TagLibMultiLanguageWeather?lang=fr" type="button">FR</a>
    <a href="TagLibMultiLanguageWeather?lang=en" type="button">ENG</a>
</div>
<form method="post" action="JSPMultiLanguageWeather">
    <label for="country-select"><% resources.getString("labelCountry");%></label>
    <select name="country" id="country-select">
        <option value=""<% resources.getString("selection");%>/option>
        <option value="France"><% resources.getString("fr");%></option>
        <option value="Allemagne"><% resources.getString("ge");%></option>
        <option value="USA"><% resources.getString("us");%></option>
        <option value="Taiwan"><% resources.getString("tw");%></option>
    </select>
    <button type="submit">OK</button>
</form>

<p ${weather.selected == false ? ' hidden' : ''}> ${weather.country}<% resources.getString("s1");%>${weather.capital}<% resources.getString("s2");%>${weather.temperature}</p>
<div style=\"clear:both\"></div>
<image style="float: left " ${weather.selected == false || weather == null ? 'hidden' : ''} src="GraphicWeather?country=${weather.country}">
</body>
</html>

