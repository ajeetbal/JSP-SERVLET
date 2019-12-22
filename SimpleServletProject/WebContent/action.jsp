<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String userName=request.getParameter("userName");
if(userName!=null){
	session.setAttribute("savedSessionUSerName", userName);
	application.setAttribute("savedContextUSerName", userName);
	pageContext.setAttribute("savedPageCOntextUSerName",userName);
}

out.println(session.getAttribute("savedSessionUSerName"));
out.println(session.getAttribute("savedContextUSerName"));

%>

</body>
</html>