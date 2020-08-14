<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login Page</title>
</head>
<style>
#heading
{
text-align:center;
color:black;
background-color:#789768;
height:60px;
padding-top:1px;
}
</style>
<body >
<div id="heading">
<h3> STUDENT LOGIN PAGE</h3>
</div>
<form action="studentinfo.jsp">
<table >
<tr> 
<td>Student Id </td>
<td><input type="text" name="student_id"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password"/></td>
</tr>
<tr> 
<td> <input type="submit" value="login"/> </td> </tr>
</table>
</form>
</body>
</html>