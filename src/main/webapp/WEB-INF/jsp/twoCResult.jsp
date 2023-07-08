<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-c 결과</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">고객명</td>
        <td width="100">책제목</td>
        <td width="100">출판사명</td>
        <td width="100">저자명</td>
        <td width="100">저자주소</td>
        <td width="100">저자url</td>
    </tr>
    <c:forEach items="${twoCResults}" var="twoCResult">
        <tr>
            <td width="100">${twoCResult.getCustomer_name()}</td>
            <td width="100">${twoCResult.getTitle()}</td>
            <td width="100">${twoCResult.getPublisher_name()}</td>
            <td width="100">${twoCResult.getAuthor_name()}</td>
            <td width="100">${twoCResult.getAddress()}</td>
            <td width="100">${twoCResult.getUrl()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>