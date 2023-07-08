<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-a 결과</title>
</header>
<body>
    <p>Writer의 이름과 주소를 입력하시오</p>
    <form name="bform" method="post" action="/a2">
        <p>이름 : <input type="text" name="name"></p>
        <p>주소 : <input type="text" name="address"></p>
        <p><input type="submit" name="Submit" value="보내기"></p>
    </form>
</body>
</html>