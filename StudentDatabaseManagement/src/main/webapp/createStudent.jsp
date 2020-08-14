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
<td>StudentId</td> <td> <input type="text" name="studentid"/></td>
</tr>
<tr>
<td>Student Name</td> <td> <input type="text" name="name"/></td>
</tr>
<tr>
<td>Study Mark1</td> <td> <input type="text" name="studymark1"/></td>
</tr>
<tr>
<td>Study Mark2</td> <td> <input type="text" name="studymark2"/></td>
</tr>
<tr>
<td>Study Mark3</td> <td> <input type="text" name="studymark3"/></td>
</tr>
<tr>
<td>Sports Mark1</td> <td> <input type="text" name="sportsmark1"/></td>
</tr>
<tr>
<td>Sports Mark2</td> <td> <input type="text" name="sportsmark2"/></td>
</tr>
<tr>
<td> <input type="submit" value="submit"/>
</tr>
</table>
</form>

</body>
</html>