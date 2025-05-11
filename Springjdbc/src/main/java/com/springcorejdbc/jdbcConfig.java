package com.springcorejdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcorejdbc.Dao.Studentdao;
import com.springcorejdbc.Dao.studentdaoimpl;

@Configuration
@ComponentScan(basePackages = {"com.springcorejdbc.Dao"})
public class jdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("7763938412");
		return ds;
	}
	
	
	@Bean("jdbcTemplat")
	public JdbcTemplate getTemplate() {
		JdbcTemplate  jdbcTemplat = new JdbcTemplate();
		jdbcTemplat.setDataSource(getDataSource());
		return jdbcTemplat;
	}
	
//	@Bean("studentdao")
//	public Studentdao getStudentdao() {
//		studentdaoimpl studentdao= new studentdaoimpl();
//		studentdao.setJdbcTemplate(getTemplate());
//	  return studentdao;
//		
//	}

}
