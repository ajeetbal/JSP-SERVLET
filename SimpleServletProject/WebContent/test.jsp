<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello JSP</h1>


<!-- declarative tag contains all methods which will be available to all script tag
 -->	
 <%!public int sum(int a, int b) {
		return a + b;
	}%>
	<%
		int i = 0;
	%>
	value is :<%=i%>

<%
int k=sum(23,54);
%>
value is :<%=k %>


<% %>
</body>
</html>