<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Professor</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">PNO</td>
        <td width="100">PNAME</td>
        <td width="100">PMAJOR</td>
        <td width="100">PDEPT</td>
        <td width="100">총개수</td>
    </tr>
    <c:forEach items="${professors}" var="professor">
        <tr>
            <td width="100">${professor.getPno()}</td>
            <td width="100">${professor.getPname()}</td>
            <td width="100">${professor.getPmajor()}</td>
            <td width="100">${professor.getPdept()}</td>
            <td width="100">${total_num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>