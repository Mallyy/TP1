<%--
  Created by IntelliJ IDEA.
  User: marie
  Date: 02/01/2022
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP Weather-fr</title>
</head>
<body>
<h1>Weather-fr ( jsp )</h1>
<form method="post" action="JSPMultiLanguageWeather">    <label for="language-select">Langage:</label>
  <select name="language" id="language-select">
    <option value="">-Choisissez un langage--</option>
    <option value="fr">Francais</option>
    <option value="en">English</option>
  </select>
  <label for="country-select">Pays:</label>
  <select name="country" id="country-select">
    <option value="">--Choisissez un pays--</option>
    <option value="France">France</option>
    <option value="Allemagne">Allemagne</option>
    <option value="USA">Etats Unis</option>
    <option value="Taiwan">Taiwan</option>
  </select>
  <button type="submit">OK</button>
</form>

<p ${weather.selected == false ? 'hidden' : ''}> ${weather.country}: dans la capital du pays ,  ${weather.capital}, la température est de ${weather.temperature}</p>
<div style=\"clear:both\"></div>
<image style="float: left " ${weather.selected == false || weather == null ? 'hidden' : ''} src="GraphicWeather?country=${weather.country}">
</body>
</html>
