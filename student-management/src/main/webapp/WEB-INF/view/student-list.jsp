<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="/student-management/URLToReachResourceFolder/css/my-style-sheet.css">
</head>
<body>
	<div class="container">
		<h3 align="center">Student List</h3>

		<form action="/student-management/showAddStudentPage">
			<input type="submit" value="ADD" class="btn btn-outline-success" />

		</form>
		

		<br />
		<table class="table table-striped">
			<thead>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>country</td>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a
						href="/student-management/updateStudent?userId=${student.id}">Update</a></td>
					<td><a
						href="/student-management/deleteStudent?userId=${student.id}"
						onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
		<form action="/student-management/">

			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<input type="submit" value="To Start Page"
					class="btn btn-outline-success" />
			</div>
		</form>
		<img alt="students photo" class="rounded mx-auto d-block img-fluid"
			src="/student-management/URLToReachImagesFolder/students.png">
	</div>
</body>
</html>