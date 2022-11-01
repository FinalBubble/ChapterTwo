<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yangq
  Date: 2022-10-05
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--通过域对象，将数据从Servlet直接传输到JSP中，在JSP中可直接写java代码--%>
    <%//脚本片段
        List<String> list = (List<String>) request.getAttribute("doorList");
        //遍历
        for (String door:
             list) {
            response.getWriter().write("<p>"+door+"</p>");
        }
    %>

</body>
</html>
