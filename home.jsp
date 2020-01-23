<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#bodycontent label { padding-left:20px }
</style>

</head>
<body>
	<form action="addEmployee">
		<label>Employee ID:</label><input type="text" name="emp_id" id="emp_id"><br>
		<label>Employee Name:</label><input type="text" name="emp_name" id="emp_name"><br>
		<label>Employee Designation:</label><input type="text" name="designation" id="designation"><br>
		<input type="submit"><br>
	</form>
	
	<form action="getEmployee">
		<input type="text" name="emp_id"><br>
		
		<input type="submit">
	</form>

</body>
</html>