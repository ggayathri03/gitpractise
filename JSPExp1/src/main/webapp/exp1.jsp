<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1>JSP Tags Example</h1>
			
			<!-- Declaration Tag -->
			
			<%!
				int x = 30;
				int y = 50;
				
				public int add()
				{
					return x+y;
				}
				
				String str = "java";
				
				
			%>
			
			<!-- Expression Tag -->
			
			<%= add()%>
			
			<!-- scriplet tag -->
			
			<%
				out.println("CURRENT DATAE : "+new Date());
				
			%>
			<br>
			<%
				out.println("Test");
			%>
			
			
</body>
</html>