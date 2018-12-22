<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8" import="com.bit.member.model.MemberDto"%>  
<%
MemberDto memberDto = new MemberDto();
memberDto.setId("java2");
memberDto.setName("안효인");
memberDto.setEmail("troment@nate.com");

session.setAttribute("userInfo", memberDto);

response.sendRedirect(request.getContextPath() + "/badmin/boardmenu.bit");
%>
=======
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<a href="${root}/"></a><br>
<a href="${root}"></a>
</center>
</body>
</html>
>>>>>>> bc47978aa211d79907ae1f647d7d6bfbc442f2c0
