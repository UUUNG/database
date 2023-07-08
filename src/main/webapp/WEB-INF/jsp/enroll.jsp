<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Enroll</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">SNO</td>
        <td width="100">CNO</td>
        <td width="100">GRADE</td>
        <td width="100">EXAM</td>
        <td width="100">총개수</td>
    </tr>
    <c:forEach items="${enrolls}" var="enroll">
        <tr>
            <td width="100">${enroll.getSno()}</td>
            <td width="100">${enroll.getCno()}</td>
            <td width="100">${enroll.getGrade()}</td>
            <td width="100">${enroll.getExam()}</td>
            <td width="100">${total_num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>