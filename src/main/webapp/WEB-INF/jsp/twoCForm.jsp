<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-c 결과</title>
    <script>
        function clickCustomer(email) {
            var form = document.createElement("form");
            form.setAttribute("method", "post");
            form.setAttribute("action", "/c2");

            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", "email");
            hiddenField.setAttribute("value", email);

            form.appendChild(hiddenField);
            document.body.appendChild(form);
            form.submit();
        }
    </script>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">EMAIL</td>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr onclick="clickCustomer('${customer.getEmail()}')">
            <td width="100">${customer.getEmail()}</td>
            <td width="100">${customer.getName()}</td>
            <td width="100">${customer.getAddress()}</td>
            <td width="100">${customer.getPhone()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>