package com.klef.jfsd.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.klef.jfsd.pojo.Faculty;

public class FacultyDAOImpl implements FacultyDAO
{

  private JdbcTemplate jdbcTemplate;
  
  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public int AddFaculty(Faculty faculty)
  {
 
    String qry ="insert into faculty values(?,?,?,?,?,?,?,?,?,?,?,?)";
  int n=jdbcTemplate.update(qry,faculty.getId(),faculty.getName(),faculty.getGender(),faculty.getDob(),faculty.getQualification(),faculty.getDepartment(),faculty.getDesignation(),faculty.getMaritalstatus(),faculty.getContactno(),faculty.getEmailid(),faculty.getLocation(),faculty.getSalary());                                                
  
    return n;
  }

  @Override
  public int UpdateFaculty(Faculty faculty)
  {

 //String qry = "update faculty set salary=?,location=?,maritalstatus=? where id=?";
	  String qry = "update faculty set dob=? where id=?";
 
// int n = jdbcTemplate.update(qry,faculty.getSalary(),faculty.getLocation(),faculty.getMaritalstatus(),faculty.getId());
	  int n = jdbcTemplate.update(qry,faculty.getDob(),faculty.getId());
	  return n;
  }

  @Override
  public int DeleteFaculty(int id) 
  {
    String qry = "delete from faculty where id=?";
      int n =    jdbcTemplate.update(qry,id);
    return n;
  }

  @Override
  public List<Faculty> ViewAllFaculty() 
  {
    String qry = "select * from faculty";
  List<Faculty> facultylist =jdbcTemplate.query(qry, new BeanPropertyRowMapper(Faculty.class));

    return facultylist;
  }

  @Override
    public Faculty ViewFacultyByID(int id) 
    {
      String qry = "select * from faculty where id=?";
      
      Faculty faculty = (Faculty) jdbcTemplate.queryForObject(qry, new Object[] {id},new BeanPropertyRowMapper(Faculty.class));
      
      return faculty;
    }
  
}