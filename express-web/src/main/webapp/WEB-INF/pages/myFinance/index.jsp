<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String extjsPath = "http://222.22.94.22:8090/ext-4.2.1.883/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Express</title>
</head>
<link rel="stylesheet" type="text/css"
      href="<%=extjsPath%>resources/css/ext-all-neptune.css">
<script type="text/javascript" src="<%=extjsPath%>ext-all.js"></script>
<script type="text/javascript"
        src="<%=extjsPath%>locale/ext-lang-zh_CN.js"></script>
<script type="text/javascript">
    var localObj = window.location;
    var contextPath = localObj.pathname.split("/")[1];
    var basePath = localObj.protocol + "//" + localObj.host + "/" + contextPath;
    var server_context = basePath;
</script>
<body>
<%
    System.out.println(path);
%>
</body>
</html>