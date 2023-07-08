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
        <td width="100">학생넘버</td>
        <td width="100">학생이름</td>
        <td width="100">총학점</td>
        <td width="100">평균점수</td>
    </tr>
    <c:forEach items="${eResults}" var="eResult">
        <tr>
            <td width="100">${eResult.getSno()}</td>
            <td width="100">${eResult.getSname()}</td>
            <td width="100">${eResult.getTotal_credits()}</td>
            <td width="100">${eResult.getAverage_exam_score()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>