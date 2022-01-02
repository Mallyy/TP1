<%--
  Created by IntelliJ IDEA.
  User: vinci
  Date: 02/01/2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tagWeather" uri="imt.nordeurope.j2ee.tp.Baey_Leclercq.tag.I18NWeather"%>
<html>
<head>
    <title>Weather-Tld</title>
</head>
<body>
<h1>Weather ( tld )</h1>
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

<p ${weather.selected == false ? 'hidden' : ''}> ${weather.country}: in city of ${weather.capital} (capital), the temperature is ${weather.temperature}</p>
<div style=\"clear:both\"></div>
<image style="float: left " ${weather.selected == false || weather == null ? 'hidden' : ''} src="GraphicWeather?country=${weather.country}">
</body>
</html>

