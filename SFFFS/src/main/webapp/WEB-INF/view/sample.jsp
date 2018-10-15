<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample Page</title>
<%@include file="./default/head.jsp" %>
<script type="text/javascript" src="<c:url value="/resources/js/sample.js"/>"></script>
</head>
<body>
    Welcome To SamplePage
    <p> Random Number Button : <input type="button" value="refresh" onclick="requestPost()"/>
    <div id="randomBox">?</div>
</body>
</html>