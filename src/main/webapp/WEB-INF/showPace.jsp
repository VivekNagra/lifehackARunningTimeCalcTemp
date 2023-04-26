<%--
  Created by IntelliJ IDEA.
  User: vcode
  Date: 26/04/2023
  Time: 00.06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Pace</title>
</head>
<body>
<h1> here you can check your pace</h1>

<h3>The distance you ran was: ${sessionScope.distance} k</h3><br>
<h3> which took you:${sessionScope.time/60}</h3> <br>
<br>
<h3><%= "your pace is:"%> ${sessionScope.pace} </h3>
</body>
</html>
