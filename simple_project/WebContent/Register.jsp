<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="reg.css?ver-1.3"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="reg">
<%! String data; %>
<% if(request.getAttribute("data")!= null){
	
   data = (String) request.getAttribute("data");
}
%>
	
	

<h1>Register</h1>

 <p class="wrongdata"> <%  if(data!=null)out.println(data); %></p>
<form action="ControllRequest" method="post">
<input class="inpx"  name="username"  type="text" placeholder="enter your username" required/> <br/>
<input class="inpx" name="email" type="email" placeholder="enter your email" required/><br/>
<input class="inpx" name="password" type="password" placeholder="enter your password" required/> <br/>
<input class="inpx" name="confirmpass" type="password" placeholder="comfirm your password" required/> <br/>
<input id="sub" name="submit" class="inpx" type="submit" value="register" /> <a href="login.jsp">Login here</a><br/>
</form>
</div>
</body>
</html>