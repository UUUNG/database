<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Course</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">CNO</td>
        <td width="100">CNAME</td>
        <td width="100">CREDIT</td>
        <td width="100">SESSIONS</td>
        <td width="100">총개수</td>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td width="100">${course.getCno()}</td>
            <td width="100">${course.getCname()}</td>
            <td width="100">${course.getCredit()}</td>
            <td width="100">${course.getSessions()}</td>
            <td width="100">${total_num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>