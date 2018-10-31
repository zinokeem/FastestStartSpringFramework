<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Damn</title>
        <%@include file="/resources/templates/default.jsp" %>
        <script type="text/javascript" src="<c:url value="/resources/js/damn.js"/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/damn.css"/>">
    </head>
    <body>
        <ul id="slide-out" class="sidenav">
            <li>
                <div class="user-view">
                <div class="background" style="background-color:#393b44"></div>
                <a href="#user"><img class="circle" src="/resources/images/saketocat.png"></a>
                <a href="#name"><span class="white-text name">znkim</span></a>
                <a href="#email"><span class="white-text email">gbmin14@naver.com</span></a>
                </div>
            </li>
            <li><a href="#!"><i class="material-icons">info_outline</i>Mold Link</a></li>
            <li><div class="divider"></div></li>
        </ul>
        <div class="container">
            <div id="info" class="card grey lighten-5">
                <div class="card-content black-text">
                    <span class="card-title">DESCRIPTION</span>
                    <p>Email / gbmin14@naver.com</p>
                    <p>Design Framework / Materialize 1.0.0</p>
                    <p>Web Framework / Spring 3.1.1 RELEASE</p>
                    <p>Infra Platform / Google Cloude Platform</p>
                    <p>Database / MariaDB</p>
                </div>
                <div class="card-action">
                    <a id="close-btn" class="grey-text text-darken-1" href="#">close</a>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="blank"></div>
            <a class="waves-effect waves-light red darken-2 btn sidenav-trigger" data-target="slide-out" title="open the menu"><i class="material-icons">menu</i></a>
            <a class="waves-effect waves-light grey darken-1 btn" onclick="testGet();" title="get status to server">get</a>
            <a class="waves-effect waves-light grey darken-2 btn" onclick="testPost();" title="get the random number to server.">post</a>
            <a class="waves-effect waves-light grey darken-3 btn" onclick="testService();" title="refresh table to db server"><i class="material-icons">refresh</i></a>
        </div>
        <div class="container">
            <table id="list">
                <thead></thead>
                <tbody></tbody>
            </table>
        </div>
    </body>
</html>