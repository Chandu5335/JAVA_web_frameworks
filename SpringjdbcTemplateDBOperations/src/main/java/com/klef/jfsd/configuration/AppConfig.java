package com.klef.jfsd.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.klef.jfsd.dao.FacultyDAO;
import com.klef.jfsd.dao.FacultyDAOImpl;

@Configuration
public class AppConfig {

	@Bean
	public DataSource dataSource()                 //Connection class
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Chandu@03");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		
		return jdbcTemplate;
	}
	
	@Bean
	public  FacultyDAO facultyDAO(){
		FacultyDAOImpl facultydao = new FacultyDAOImpl();
		facultydao.setJdbcTemplate(jdbcTemplate());
		
		return facultydao;
	}
	
	
}
