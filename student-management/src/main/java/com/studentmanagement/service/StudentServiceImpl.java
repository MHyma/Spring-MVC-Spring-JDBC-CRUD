package com.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.api.Students;
import com.studentmanagement.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Students> loadStudents() {
	List<Students> studentList=	studentDAO.loadStudents();
		return studentList;
	}

	@Override
	public void saveStudent(Students student) {
		studentDAO.saveStudent(student);
		
	}

	@Override
	public Students getStudent(int id) {
		return studentDAO.getStudent(id);
	}

	@Override
	public void update(Students student) {
		studentDAO.update(student);
		
	}

	@Override
	public void deleteStudent(int id) {
	studentDAO.deleteStudent(id);
		
	}

}
