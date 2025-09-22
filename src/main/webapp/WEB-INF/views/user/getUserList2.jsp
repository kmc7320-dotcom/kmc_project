<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




	<h3>getUserLIST2</h3>
	 성공여부 : ${cnt}<br>
	<form action="#" method="post">
	<!-- //방법 1 where user id in (1,2)검색 -->
		<table border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등록일</th>
			</tr>
			<!-- 반복문 -->
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.userId}</td>
					<td>${user.userName}</td>
					<td>${user.regDate}</td>
			   </tr>
			   </c:forEach>
		</table>
	</form>

</body>
</html>