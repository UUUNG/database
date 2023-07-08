<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-e 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">년도</td>
        <td width="100">평균가격</td>
        <td width="100">전체평균가격</td>
    </tr>
    <c:forEach items="${results}" var="result">
        <tr>
            <td width="100">${result.getYear()}</td>
            <td width="100">${result.getAverage_price()}</td>
            <td width="100">${result.getOverall_average_price()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>