<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="reg.css?ver-1.2"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="reg">

<% if(request.getAttribute("data")!= null){
	String data = (String) request.getAttribute("data");
	out.println(data);
	
	
}
	%>

<h1>Login</h1>
<form action="ControllRequest" method="post">
<input class="inpx"  name="username"  type="text" placeholder="enter your username" /> <br/>

<input class="inpx" name="password" type="password" placeholder="enter your password" /> <br/>

<input id="sub" name="submit" class="inpx" type="submit" value="login" /> <a href="Register.jsp">Register here</a><br/> <a href="forgotpass.jsp">Forgot password?</a><br/>
</form>
</div>
</body>
</html>