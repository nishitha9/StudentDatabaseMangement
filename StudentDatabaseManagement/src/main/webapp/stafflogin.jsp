<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staff Login Page</title>
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
<body>
<div id="heading">
<h3 >STAFF LOGIN PAGE </h3>
</div>
<form action="staffinfo.jsp" method="post">
<table>
<tr> 
<td>Staff Name </td>
<td><input type="text" name="staff_name"/></td>
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