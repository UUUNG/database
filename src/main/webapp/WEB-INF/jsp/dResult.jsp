<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-d 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">코스이름</td>
        <td width="100">최대점수</td>
        <td width="100">최소점수</td>
        <td width="100">학생넘버</td>
        <td width="100">학생이름</td>
    </tr>
    <c:forEach items="${dResults}" var="dResult">
        <tr>
            <td width="100">${dResult.getCname()}</td>
            <td width="100">${dResult.getMax_score()}</td>
            <td width="100">${dResult.getMin_score()}</td>
            <td width="100">${dResult.getSno()}</td>
            <td width="100">${dResult.getSname()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>