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




	<h3>getUserSearchInfo</h3>
	<form action="#" method="post">
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
			 </c:forEach> 
		</table>
		

	</form>

</body>
</html>