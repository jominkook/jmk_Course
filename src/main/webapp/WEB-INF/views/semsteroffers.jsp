<%@ page language="java" contentType="text/html; charset=UTF-8" 

pageEncoding="UTF-8"%> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html> 

<html> 

<head> 

<meta charset="UTF-8"> 

<title></title> 

</head> 

<body> 

<form method="get"> 

<table border="1"> 

<tr> 

<th height="20" width="20">년도</th> 

<th height="20" width="20">학기</th> 

<th height="40" width="40">이수학점</th> 

<th height="40" width="40">상세</th> 

</tr> 

<tr> 

<td height="40" width="40">2018</td> 

<td height="20" width="40">1학기</td> 

<td height="20" width="40">12</td> 

<td height="20" width="40"> 

<p> 

<a href="${pageContext.request.contextPath }/offers1">링크</a> 

</p> 

</td> 

</tr> 

<tr> 

<td height="20" width="40">2018</td> 

<td height="20" width="40">2학기</td> 

<td height="20" width="40">14</td> 

<td height="20" width="40"> 

<p> 

<a href="${pageContext.request.contextPath }/offers2">링크</a> 

</p> 

</td> 

</tr> 

<tr> 

<td height="20" width="40">2019</td> 

<td height="20" width="40">1학기</td> 

<td height="20" width="40">18</td> 

<td height="20" width="40"> 

<p> 

<a href="${pageContext.request.contextPath }/offers3">링크</a> 

</p> 

</td> 

</tr> 

<tr> 

<td height="20" width="40">2019</td> 

<td height="20" width="40">2학기</td> 

<td height="20" width="40">18</td> 

<td height="20" width="40"> 

<p> 

<a href="${pageContext.request.contextPath }/offers4">링크</a> 

</p> 

</td> 

</tr> 

 

 

</table> 

</form> 

</body> 

</html> 