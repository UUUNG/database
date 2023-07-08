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
        <td width="100">과목명</td>
        <td width="100">평균점수</td>
        <td width="100">A학점</td>
        <td width="100">B학점</td>
        <td width="100">C학점</td>
        <td width="100">D학점</td>
        <td width="100">F학점</td>
    </tr>
    <c:forEach items="${fResults}" var="fResult">
        <tr>
            <td width="100">${fResult.getCname()}</td>
            <td width="100">${fResult.getAverage_exam_score()}</td>
            <td width="100">${fResult.getGrade_a()}</td>
            <td width="100">${fResult.getGrade_b()}</td>
            <td width="100">${fResult.getGrade_c()}</td>
            <td width="100">${fResult.getGrade_d()}</td>
            <td width="100">${fResult.getGrade_f()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>