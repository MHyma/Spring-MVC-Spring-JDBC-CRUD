package com.studentmanagement.service;

import java.util.List;

import com.studentmanagement.api.Students;

public interface StudentService {

	List<Students>  loadStudents();

	void saveStudent(Students student);
	
	Students getStudent(int id);

	void update(Students student);

	void deleteStudent(int id);
}
