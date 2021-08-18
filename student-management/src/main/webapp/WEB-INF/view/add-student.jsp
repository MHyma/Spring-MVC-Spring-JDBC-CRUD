<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="/student-management/URLToReachResourceFolder/css/add-student.css">
<link rel="stylesheet" type="text/css"
	href="/student-management/URLToReachResourceFolder/css/my-style-sheet.css">
</head>
<body>
	<div align="center">
		<h3>Add Student</h3>
			
		
		<form:form action="saveStudent" modelAttribute="student" method="POST">
			<form:hidden path="id" />
			<div class="row">
				<div class="col">
					<label>Name :</label>
					<form:input path="name" />
				</div>
			</div>
			<br />
			<div class="row">
				<div class="col">
					<label>Mobile :</label>
					<form:input path="mobile" />
				</div>
			</div>
			<br />
			<div class="row">
				<div class="col">
					<label>Country :</label>
					<form:input path="country" />
				</div>
			</div>
			<br />
			<input type="submit" value="Submit" class="btn btn-outline-success" />
			
		</form:form>
		<br/>
		<form action="/student-management/showStudent">
			<input type="submit" value="Back" class="btn btn-outline-success"/>

		</form>
		<img alt="students photo" class="rounded mx-auto d-block"
			src="/student-management/URLToReachImagesFolder/students.png">
	</div>
</body>
</html>