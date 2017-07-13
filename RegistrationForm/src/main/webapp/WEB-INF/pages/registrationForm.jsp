<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Registration Form</h1>
<p>Register the new  user.</p>
<form  method="POST" commandName ="registration" action="/registration/add.html"   >
<table>

    <tr>
		<td>User ID:</td>
		<td><input type="text"  name="id" /></td>
	</tr>

	<tr>
		<td>Name:</td>
		<td><input type="text"  name="username" /></td>
	
		<td>Password:</td>
		<td><input type="password" name="password" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Add" /></td>
		<td></td>
	</tr>

</table>
<form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>