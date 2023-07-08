<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>레코드 출력</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">아이디</td>
        <td width="100">이름</td>
        <td width="100">학과명</td>
        <td width="100">이수학점</td>
    </tr>
    <c:forEach items="${enrolls}" var="enroll">
        <tr>
            <td width="100">${enroll.getSno()}</td>
            <td width="100">${enroll.getCno()}</td>
            <td width="100">${enroll.getGrade()}</td>
            <td width="100">${enroll.getExam()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>