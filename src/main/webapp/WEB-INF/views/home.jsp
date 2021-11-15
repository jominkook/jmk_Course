<%@ page language="java" contentType="text/html; charset=UTF-8" 

pageEncoding="UTF-8"%> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html> 

<html> 

<head> 

<title></title> 

</head> 

<body> 

<h3>안녕하세요 수강신청홈페이지입니다!!</h3> 

<p> 

<a href="${pageContext.request.contextPath}/semsteroffers">학기별 이수 

학점조회</a> 

</p> 

<p> 

<a href="${pageContext.request.contextPath}/createoffers">수강 신청하기</a> 

</p> 

<p> 

<a href="${pageContext.request.contextPath}/selectoffers">수강 신청 

조회메뉴</a> 

</p> 

<c:if test="${pageContext.request.userPrincipal.name != null}"> 

<a href="javascript:document.getElementById('logout').submit()">Logout</a> 

</c:if> 

 

<form id="logout" action="<c:url value="/logout" />" method="post"> 

<input type="hidden" name="${_csrf.parameterName}" 

value="${_csrf.token}" /> 

</form> 

 

</body> 

</html> 