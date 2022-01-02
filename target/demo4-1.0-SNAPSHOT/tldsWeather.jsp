<%--
  Created by IntelliJ IDEA.
  User: vinci
  Date: 02/01/2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="i18nWeatherTagLib" uri="WEB-INF/tlds/tp.tld"%>
<html>
<head>
    <title>Wi18nWeatherTagLibeather-Tld</title>
</head>
<body>
<i18nWeatherTagLib:i18nWeather lang='<%=request.getParameter("lang")%>

<h1>Weather ( tld )</h1>
<div style="alignment: right">
    <a href="/TagLibMultiLanguageWeather?lang=fr" type="button">FR</a>
    <a href="/TagLibMultiLanguageWeather?lang=eng" type="button">ENG</a>
    <button>FR</button>
    <button>ENG</button>
</div>
<form method="post" action="JSPMultiLanguageWeather">
    <label for="country-select">Country:</label>
    <select name="country" id="country-select">
        <option value="">--Please choose a country--</option>
        <option value="France">France</option>
        <option value="Allemagne">Germany</option>
        <option value="USA">USA</option>
        <option value="Taiwan">Taiwan</option>
    </select>
    <button type="submit">OK</button>
</form>

<p ${weather.selected == false ? ' hidden' : ''}> ${weather.country}: in city of ${weather.capital} (capital), the temperature is ${weather.temperature}</p>
<div style=\"clear:both\"></div>
<image style="float: left " ${weather.selected == false || weather == null ? 'hidden' : ''} src="GraphicWeather?country=${weather.country}">
</body>
</html>

