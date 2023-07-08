<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-b 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">TITLE</td>
        <td width="100">PRICE</td>
        <td width="100">NUM</td>
    </tr>
    <c:forEach items="${twoBResults}" var="twoBResult">
        <tr>
            <td width="100">${twoBResult.getTitle()}</td>
            <td width="100">${twoBResult.getPrice()}</td>
            <td width="100">${twoBResult.getNum()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>