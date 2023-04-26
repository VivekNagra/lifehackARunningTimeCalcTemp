<%--
  Created by IntelliJ IDEA.
  User: vcode
  Date: 24/04/2023
  Time: 14.22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pace calc</title>
</head>
<body>
<h1>Calculate your pace!</h1>
<br>
<form action="ServletCalculatePace" method="post">
    <label for="distance">Distance:</label><br>
    <input type="text" id="distance" name="distance"><br>

    <br>

    <label for="timeHour">hour(s):</label>
    <input type="text" id="timeHour" name="hours" placeholder="1">

    <label for="timeMin">minute(s):</label>
    <input type="text" id="timeMin" name="minutes" placeholder="35">

    <label for="timeSec">second(s):</label>
    <input type="text" id="timeSec" name="seconds" placeholder="58">

    <br>

    <input type="submit" class="btn" value="Calculate">
</form>





</body>
</html>
