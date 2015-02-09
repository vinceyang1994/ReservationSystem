<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>

<link rel=stylesheet type="text/css" href="css/layout/baselayout.css">
</head>
<body>
	<div id="container">
		<!-- ===============header zone=============== -->
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<%-- 		<!-- ================login zone================= -->
		<div id="menu">
			<tiles:insertAttribute name="menu" />
		</div> --%>
		<!-- ================body zone================ -->
		<div id="body">
			<tiles:insertAttribute name="body" />
		</div>
		<!-- ================footer zone================ -->
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>


</body>
</html>