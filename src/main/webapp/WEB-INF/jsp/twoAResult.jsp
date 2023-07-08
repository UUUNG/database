<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-a 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">TITLE</td>
        <td width="100">NUM</td>
    </tr>
    <c:forEach items="${twoAResults}" var="twoAResult">
        <tr>
            <td width="100">${twoAResult.getTitle()}</td>
            <td width="100">${twoAResult.getNum()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>