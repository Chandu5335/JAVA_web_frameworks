package com.klef.jfsd.dao;

import java.util.List;

import com.klef.jfsd.pojo.Faculty;

public interface FacultyDAO {
	public int AddFaculty(Faculty faculty);
	public int UpdateFaculty(Faculty faculty);
	public int DeleteFaculty(int id);
	public List<Faculty>ViewAllFaculty();
	public Faculty ViewFacultyByID(int id);

}
