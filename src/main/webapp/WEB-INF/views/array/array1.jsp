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




	<h3>array1</h3>
	<form action="#" method="post">
	<!-- //방법 1 where user id in (1,2)검색 -->
		<table border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등록일</th>
			</tr>
			<!-- 반복문 -->
			<c:forEach var="user" items="${list}">
				<tr>
					<td>${user.userId}</td>
					<td>${user.userName}</td>
					<td>${user.regDate}</td>
			   </tr>
			</c:forEach>
		</table>
		<br><br>
		<!-- //방법 2 where user_name in (john, smith) 검색 -->
		<table border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등록일</th>
			</tr>
			<!-- 반복문 -->
			<c:forEach var="user2" items="${list2}">
				<tr>
					<td>${user2.userId}</td>
					<td>${user2.userName}</td>
					<td>${user2.regDate}</td>
			   </tr>
			</c:forEach>
		</table>

	</form>

</body>
</html>