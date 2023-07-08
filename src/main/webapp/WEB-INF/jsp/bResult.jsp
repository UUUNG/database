<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-b 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">코스이름</td>
        <td width="100">학점</td>
        <td width="100">시험점수</td>
    </tr>
    <c:forEach items="${bResults}" var="bResult">
        <tr>
            <td width="100">${bResult.getCname()}</td>
            <td width="100">${bResult.getGrade()}</td>
            <td width="100">${bResult.getExam()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>