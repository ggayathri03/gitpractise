<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp</title>

<style type="text/css">

	body{
		content: normal;
		align-content: center;
		background-color: blue;
		font-style: oblique;
		font: cursive;
		color: white;
		
		text-align: center;
	}
	
</style>

</head>

<body>
		<h1>Employee Form</h1>
	<form action="empdata.jsp">
		Enter ID: <input type = "number" name = "id"><br><br>
		Enter Name: <input type = "text" name = "name"><br><br>
		Enter Company: <input type = "text" name = "cmp"><br><br>
		
		    <input type = "submit" value="submit">
  </form>
</body>
</html>