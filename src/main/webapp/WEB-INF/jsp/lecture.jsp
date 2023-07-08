<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lecture</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">CNO</td>
        <td width="100">PNO</td>
        <td width="100">LEC_TIME</td>
        <td width="100">ROOM</td>
        <td width="100">총개수</td>
    </tr>
    <c:forEach items="${lectures}" var="lecture">
        <tr>
            <td width="100">${lecture.getCno()}</td>
            <td width="100">${lecture.getPno()}</td>
            <td width="100">${lecture.getLec_time()}</td>
            <td width="100">${lecture.getRoom()}</td>
            <td width="100">${total_num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>