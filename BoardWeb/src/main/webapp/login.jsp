<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<style>
	.login-wrap{
		display: flex;
    	flex-direction: column;
    	align-items: center;
	}
	
	.login-wrap h1 {
		text-align: center;
	}
	
	.login-wrap form{
		margin-top: 20px;
	}
	
	.login-wrap hr {
		width: 100%;
	}
</style>
<body>
	<div class="login-wrap">
		<h1>로그인</h1>
		<hr>
		<form action="login.do" method="post">
			<table border="1">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="로그인"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>