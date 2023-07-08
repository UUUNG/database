<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-e 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">학과</td>
        <td width="100">학년</td>
        <td width="100">총학생수</td>
    </tr>
    <c:forEach items="${hResults}" var="hResult">
        <tr>
            <td width="100">${hResult.getDept()}</td>
            <td width="100">${hResult.getYear()}</td>
            <td width="100">${hResult.getTotal_num()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>