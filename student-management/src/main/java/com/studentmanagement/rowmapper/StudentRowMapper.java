package com.studentmanagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.studentmanagement.api.Students;

public class StudentRowMapper implements RowMapper<Students>{

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		Students student=new Students();
	student.setId(rs.getInt("id"));
	student.setName(rs.getString("name"));
	student.setMobile(rs.getLong("mobile"));
	student.setCountry(rs.getString("country"));
		return student;
	}

}
