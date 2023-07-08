<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-c 결과</title>
    <script>
        function handleClick() {
            alert("테이블이 수정되었습니다.")
        }
    </script>
</header>
<body>
<table width="500" border="1">
    <form name="cresult" method="post" action="/c/result">
        <p><input type="submit" name="Submit" value="올바르게 수정"></p>
    </form>
    <tr>
        <td width="100">학생이름</td>
        <td width="100">학번</td>
        <td width="100">과목번호</td>
    </tr>
    <c:forEach items="${cResults}" var="cResult">
        <tr onclick="handleClick()">
            <td width="100">${cResult.getSname()}</td>
            <td width="100">${cResult.getSno()}</td>
            <td width="100">${cResult.getCno()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>