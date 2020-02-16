<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rest风格、restfulAPI与@PathVariable接收rest参数</title>
</head>
<body>
<h1>rest风格、restfulAPI与@PathVariable接收rest参数</h1>

<h1>用URL定位资源</h1>
<a href="${pageContext.request.contextPath}/restful/1">
    url: /restful/1
</a>

<hr>

<h1>发送put与delete请求</h1>
<form action="${pageContext.request.contextPath}/restfulFormPut/2"
      method="post">
    <!--
        写一个隐藏的字段, 使表单能够支持PUT或DELETE请求;
        name必须为_method
        value的值为put或delete
     -->
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="PUT请求提交">
</form>
<form action="${pageContext.request.contextPath}/restfulFormDelete/2"
      method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="DELETE请求提交">
</form>

</body>
</html>
