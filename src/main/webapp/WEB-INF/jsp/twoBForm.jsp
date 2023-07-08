<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-b 결과</title>
    <script>
        function handleClick(name) {
            var form = document.createElement("form");
            form.setAttribute("method", "post");
            form.setAttribute("action", "/b2");

            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", "name");
            hiddenField.setAttribute("value", name);

            form.appendChild(hiddenField);
            document.body.appendChild(form);
            form.submit();
        }
    </script>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
        <td width="100">URL</td>
    </tr>
    <c:forEach items="${publishers}" var="publisher">
        <tr onclick="handleClick('${publisher.getName()}')">
            <td width="100">${publisher.getName()}</td>
            <td width="100">${publisher.getAddress()}</td>
            <td width="100">${publisher.getPhone()}</td>
            <td width="100">${publisher.getUrl()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>