package com.springcorejdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcorejdbc.Dao.entite.Student;

@Component("studentdao")
public class studentdaoimpl implements Studentdao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student(id, name, city) VALUES (?, ?, ?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }
    
    



	@Override
	public int change(Student student) {
		String query = "UPDATE student SET name=?, city=? WHERE id=?";
		int result = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;

	}



	@Override
	public int delete(int studentId) {
		String query = "DELETE FROM student WHERE id=?";
	    int result = jdbcTemplate.update(query, studentId);
	    return result;
		
	}



	@Override
	public Student getStudent(int studentId) {
		// selecting single student data
		
		String query = "select * FROM student WHERE id=?";
		
		Student student=(Student) this.jdbcTemplate.queryForObject(query, new RowMapper() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
				
				
			}
			
		} ,studentId );
		
		  return student;
		
	}



	@Override
	public List<Student> getAllStudent() {
		String query = "select * FROM student";
		
	    List<Student> students= this.jdbcTemplate.query(query, new RowMapperImpl());

		return students;
	
	}
	
}
