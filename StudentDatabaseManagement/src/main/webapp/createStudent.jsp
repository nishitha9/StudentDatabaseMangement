<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Mark Details</title>
</head>
<body>
<h3> Enter Student Details </h3>
<form action="createStudent" method="post">
<table>
<tr>
<td>StudentId</td> <td> <input type="text" id="studentid"/></td>
</tr>
<tr>
<td>Student Name</td> <td> <input type="text" id="name"/></td>
</tr>
<tr>
<td>Study Mark1</td> <td> <input type="text" id="studymark1"/></td>
</tr>
<tr>
<td>Study Mark2</td> <td> <input type="text" id="studymark2"/></td>
</tr>
<tr>
<td>Study Mark3</td> <td> <input type="text" id="studymark3"/></td>
</tr>
<tr>
<td>Sports Mark1</td> <td> <input type="text" id="sportsmark1"/></td>
</tr>
<tr>
<td>Sports Mark2</td> <td> <input type="text" id="sportsmark2"/></td>
</tr>
<tr>
<!-- <td> <input type="submit" value="submit"/>  -->
<td> <button onclick="convertToJsonString()"> createStudent</button>  </td>
</tr>
</table>
</form>
<script src="createStudent.js">


</script>
</body>
</html>