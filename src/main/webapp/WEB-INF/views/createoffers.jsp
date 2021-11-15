<%@ page language="java" contentType="text/html; charset=UTF-8" 

    pageEncoding="UTF-8"%> 

 

<!DOCTYPE html> 

<html> 

<head> 

<meta charset="UTF-8"> 

<title></title> 

</head> 

<body> 

<h3>2020예상과목 수강신청</h3> 

<hr> 

<form method ="post" action= "${pageContext.request.contextPath}/docreate"> 

<table> 

<tr> <td>년도:</td><td><input type ="text" name="year"/></td></tr> 

<tr> <td>학기:</td><td><input type ="text" name="semster"/></td></tr> 

<tr> <td>과목코드:</td><td><input type ="text" name="code"/></td></tr> 

<tr> <td>과목명:</td><td><input type ="text" name="name"/></td></tr> 

<tr> <td>구분:</td><td><input type ="text" name="classify"/></td></tr> 

<tr> <td>학점:</td><td><input type ="text" name="credit"/></td></tr> 

<tr> <td></td><td><input type ="submit" value="신청하기"/></td></tr> 

</table> 

</form> 

 

</body> 

</html> 