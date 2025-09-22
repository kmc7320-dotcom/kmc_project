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
				<th>게시글제목</th>
				<th>게시글내용</th>
			</tr>

			<!-- 반복문 -->
			<c:forEach var="user" items="${list}">
				<c:forEach var="board" items="${user.boardDTO}">
					<tr>
						<td align="center">${user.userId}</td>
						<td align="center">${user.userName}</td>
						<td align="center">${user.regDate}</td>
						<td align="center">${board.boardTitle}</td>
						<td align="center">${board.boardContent}</td>
					</tr>
				</c:forEach>
			</c:forEach>
		</table>


	</form>

</body>
</html>