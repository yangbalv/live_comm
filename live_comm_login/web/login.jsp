<%--
  Created by IntelliJ IDEA.
  User: ZTY
  Date: 2022-07-29
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>跳转到主页</title>
</head>
<body>
<!-- 这里的index.jsp并不是真正的主页， 系统的所有页面都放在 WEB-INF/pages下，这样用户就无法对这些页面直接访问-->
<jsp:forward page="/liveComm/login"></jsp:forward>
</body>
</html>