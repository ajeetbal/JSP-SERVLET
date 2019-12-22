<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Default User from  :
<%=getServletConfig().getInitParameter("defaultUser")
%>
<br/>

<%!
public void jspInit(){
	getServletContext().setAttribute("defaultUser", "ajeet");
}
%>
Default User from  :
<%=getServletContext().getAttribute("defaultUser") %>
</body>
</html>