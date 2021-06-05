<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="message.user.login.title"/></title>
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
		<h1><spring:message code="message.user.login.title"/></h1>
		<a href="login.do?lang=en"><spring:message code="message.user.login.language.en"/></a>&nbsp;&nbsp;
		<a href="login.do?lang=ko"><spring:message code="message.user.login.language.ko"/></a>
		<hr>
		<form action="login.do" method="post">
			<table border="1">
				<tr>
					<td bgcolor="orange"><spring:message code="message.user.login.id"/></td>
					<td><input type="text" name="id" value="${userVO.id }"/></td>
				</tr>
				<tr>
					<td bgcolor="orange"><spring:message code="message.user.login.password"/></td>
					<td><input type="password" name="password" value="${userVO.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="<spring:message code="message.user.login.loginBtn"/>"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>