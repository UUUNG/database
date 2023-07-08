<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-b 결과</title>
</header>
<body>
    <p>Student의 아이디를 입력하시오</p>
    <form name="bform" method="post" action="/b">
        <p>아이디 : <input type="text" name="sNumber"></p>
        <p><input type="submit" name="Submit" value="보내기"></p>
    </form>
</body>
</html>