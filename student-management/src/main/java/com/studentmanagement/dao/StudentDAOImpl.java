package com.studentmanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.studentmanagement.api.Students;
import com.studentmanagement.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Students> loadStudents() {
		// List<Students> studentList= new ArrayList<Students>();
		String sql = "SELECT * FROM student_management.students";
		List<Students> theListOfStudents = jdbcTemplate.query(sql, new StudentRowMapper());
		// studentList=theListOfStudents;

		return theListOfStudents;
	}

	@Override
	public void saveStudent(Students student) {
		Object[] sqlParameters = { student.getName(), student.getMobile(), student.getCountry() };

		String sql = "insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql, sqlParameters);

		System.out.println("1 record inserted");

	}

	@Override
	public Students getStudent(int id) {
		String sql = "SELECT * FROM STUDENTS WHERE ID=?";
		Students student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);

		return student;
	}

	@Override
	public void update(Students student) {

		String sql = "UPDATE STUDENTS SET name=?,mobile=?,country=? WHERE id=?";
		jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry(), student.getId());
		System.out.println("1 record updated.....");

	}

	@Override
	public void deleteStudent(int id) {
		String sql="DELETE FROM STUDENTS WHERE ID=?";
		jdbcTemplate.update(sql, id);
		
	}

}
