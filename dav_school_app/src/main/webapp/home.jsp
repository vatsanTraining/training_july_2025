<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.example.demo.entity.* ,java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1{
text-align: center;
}

table{
border: 2px solid blue;
border-collapse: collapse;
 margin-left: auto;
 margin-right: auto;
}

tr,td,th{
border: 2px solid blue;

}
</style>
</head>
<body>

<%@ include file="header.html" %>

<h1>${title}</h1>
<table>
<tr>
 <th>Roll Number</th>
 <th>First Name </th>
 <th>Date of Birth</th>
 <th>Mark Scored</th>
</tr>
<tr>
<%

 for(Student eachStudent :((List<Student>)request.getAttribute("list"))){
%>
<td><% out.println(eachStudent.getRollNumber()); %></td>	
<td><% out.println(eachStudent.getFirstName()); %></td>	 
<td><% out.println(eachStudent.getDateOfBirth()); %></td>	 
<td><% out.println(eachStudent.getMarkScored()); %></td>	
<td><a href="edit?id=<%=eachStudent.getRollNumber()%>">Edit</a></td>	

<td><a href="delete?id=<%=eachStudent.getRollNumber() %>">Delete</a></td>	
 
 </tr>
 
<%} %> 


</table>
</body>
</html>