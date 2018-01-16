<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/16
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:iterator value="all">
    <s:property value="name"></s:property>
    <s:property value="pwd"></s:property><br>
</s:iterator>
<hr>
<img src="pic/<s:property value="myFileFileName"></s:property>">
</body>
</html>
