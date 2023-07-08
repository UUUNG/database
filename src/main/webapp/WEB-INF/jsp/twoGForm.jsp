<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-g 결과</title>
</header>
<body>
    <p>조회할 재고의 수를 입력하세요</p>
    <form name="gform" method="post" action="/g2">
        <p>재고의 수 : <input type="text" name="num"></p>
        <p><input type="submit" name="Submit" value="보내기"></p>
    </form>
</body>
</html>