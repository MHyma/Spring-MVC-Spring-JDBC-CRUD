<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourceFolder/css/my-style-sheet.css">
</head>
<body>
	<div class="container">
		<h3 align="center">Welcome To Student Management</h3>
		
		<form action="/student-management/showStudent">
			
<div class="d-grid gap-2 col-2 mx-auto">
<input type="submit" value="Go To Student List" class="btn btn-outline-success"/>
</div>
		</form>

		<img alt="students photo" class="rounded mx-auto d-block img-fluid" src="/student-management/URLToReachImagesFolder/students.png">
	</div>
</body>
</html>