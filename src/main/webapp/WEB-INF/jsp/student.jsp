<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">SNO</td>
        <td width="100">PNO</td>
        <td width="100">SNAME</td>
        <td width="100">YEAR</td>
        <td width="100">DEPT</td>
        <td width="100">총개수</td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td width="100">${student.getSno()}</td>
            <td width="100">${student.getPno()}</td>
            <td width="100">${student.getSname()}</td>
            <td width="100">${student.getYear()}</td>
            <td width="100">${student.getDept()}</td>
            <td width="100">${total_num}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>