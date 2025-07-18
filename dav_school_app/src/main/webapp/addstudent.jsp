<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>

<body>

<%@ include file="header.html" %>

<%
%>
<form action="addstudent" method="post">

<div>
<label>Roll Number</label>
<input type="text" name="rollNumber"/>
</div>


<div>
<label>First Name</label>
<input type="text" name="firstName"/>
</div>


<div>
<label>Date of Birth</label>
<input type="date" name="dateOfBirth"/>
</div>


<div>
<label>Mark Scored</label>
<input type="text" name="markScored"/>
</div>


<input type="submit" value="Add">
</form>
</body>
</html>