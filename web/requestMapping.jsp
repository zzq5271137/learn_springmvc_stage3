<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@RequestMapping相关属性</title>
</head>
<body>
<h1>@RequestMapping相关属性</h1>

<h1>value属性:</h1>
<a href="${pageContext.request.contextPath}/value1">url: /value1</a><br>
<a href="${pageContext.request.contextPath}/value2">url: /value2</a><br>

<hr>

<h1>method属性:</h1>
<form action="${pageContext.request.contextPath}/method" method="get">
    <input type="submit" value="get提交">
</form>
<form action="${pageContext.request.contextPath}/method" method="post">
    <input type="submit" value="post提交">
</form>

<hr>

<h1>params属性:</h1>
<a href="${pageContext.request.contextPath}/params?id=2&name=zzq">
    url: /params?id=2&name=zzq
</a><br>

<hr>

<h1>headers属性:</h1>
<a href="${pageContext.request.contextPath}/headers">
    url: /headers
</a><br>

<hr>

<h1>ant风格地址:</h1>
<a href="${pageContext.request.contextPath}/myAnt/1">
    url: /myAnt/1
</a><br>
<a href="${pageContext.request.contextPath}/myAnt/2">
    url: /myAnt/2
</a><br>
<a href="${pageContext.request.contextPath}/myAnt/test1">
    url: /myAnt/test1
</a><br>
<a href="${pageContext.request.contextPath}/myAnt/test2">
    url: /myAnt/test2
</a><br>
<a href="${pageContext.request.contextPath}/myAnt/level1/level2">
    url: /myAnt/level1/level2
</a><br>
<a href="${pageContext.request.contextPath}/myAnt/level1/level2/level3">
    url: /myAnt/level1/level2/level3
</a><br>

</body>
</html>
