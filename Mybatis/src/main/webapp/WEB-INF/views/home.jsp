<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>


<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>
	<c:forEach var="seq" items="${seq }">
        
        <ul>
            <li>${seq.seq }</li>
   
        </ul>
    </c:forEach>
	디비 : ${seq}
</body>
</html>
