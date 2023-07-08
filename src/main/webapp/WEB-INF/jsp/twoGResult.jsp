<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-g 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">ISBN</td>
        <td width="100">책제목</td>
        <td width="100">년도</td>
        <td width="100">가격</td>
    </tr>
    <c:forEach items="${results}" var="result">
        <tr>
            <td width="100">${result.getIsbn()}</td>
            <td width="100">${result.getTitle()}</td>
            <td width="100">${result.getYear()}</td>
            <td width="100">${result.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>