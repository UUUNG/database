<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-f 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">작가명</td>
        <td width="100">책 수</td>
        <td width="100">최대 가격</td>
        <td width="100">최소 가격</td>
        <td width="100">평균 가격</td>
    </tr>
    <c:forEach items="${results}" var="result">
        <tr>
            <td width="100">${result.getAuthor_name()}</td>
            <td width="100">${result.getBook_count()}</td>
            <td width="100">${result.getMax_price()}</td>
            <td width="100">${result.getMin_price()}</td>
            <td width="100">${result.getAverage_price()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>