<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
    %>
    결과 값: <%=sum%>
</body>
</html>
