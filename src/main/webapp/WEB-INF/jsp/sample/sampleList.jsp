<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Cache-Control" content="no-cache" />
	<meta http-equiv="Expires" content="-1" />
	<meta http-equiv="Imagetoolbar" content="no" />
    <title></title>
<style type="text/css">
	table.example2 {background-color:transparent;border-collapse:collapse;width:100%;}
	table.example2 th, table.example2 td {font-size:10px; text-align:center;border:1px solid black;padding:5px;}
	table.example2 th {background-color:AntiqueWhite;}
	table.example2 td:first-child {width:20%;}
</style>    
</head>

<body>
<table class="example2">
	<th>TITLE</th>
	<th>SUBTITLE</th>
	<c:forEach var="item" items="${itemList}">	
		<tr>
			<td>${item.title}</td>
			<td>${item.subTitle}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>    