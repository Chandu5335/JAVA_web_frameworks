package com.klef.jfsd.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klef.jfsd.configuration.AppConfig;
import com.klef.jfsd.dao.FacultyDAO;
import com.klef.jfsd.pojo.Faculty;

public class ClientController 
{
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
     FacultyDAO dao = context.getBean(FacultyDAO.class);
     
     
   public static void main(String args[])
   {
    
	   ClientController controller = new ClientController();
	   //controller.AddFacultyRecord();
	  // controller.UpdateFacultyRecord();
	   //controller.DeleteFacultyRecord();
	  // controller.ViewAllFacultyRecords();
	   controller.ViewFacultyRecordById();
   }
   public void AddFacultyRecord()
   {
     Faculty f = new Faculty();
     f.setId(2000032096);
     f.setName("Tendy");
     f.setGender("ERROR");
     f.setDob("Invisible");
     f.setQualification("B_TECH");
     f.setDepartment("CSE-HONORS");
     f.setDesignation("BLACKMAN");
     f.setMaritalstatus("UNMARRIED");
     f.setContactno("7075695967");
     f.setEmailid("2000032096cse@gmail.com");
     f.setLocation("GUNTUR");
     f.setSalary(145000.00);
     int n = dao.AddFaculty(f);
     if(n>0) {
    	 System.out.println("Record Added Successfully");
     }
     else {
    	 System.out.println("Failed to add your data");
     }
     
     
   }
   public void UpdateFacultyRecord()
   {
	   Faculty f = new Faculty();
	  /* f.setSalary(125000);
	   f.setLocation("KPHB");
	   f.setMaritalstatus("MARRIED");
	   */
	   f.setDob("07/06/2003");
	   f.setId(2000032096);
	   int n = dao.UpdateFaculty(f);
	     if(n>0) {
	    	 System.out.println("Record Updated Successfully");
	     }
	     else {
	    	 System.out.println("Failed to add your data");
	     }
	     
	     
	   }
   
   public void DeleteFacultyRecord()
   {
	   Faculty f = new Faculty();
	   f.setId(2000032094);
	   int n = dao.DeleteFaculty(2000032094);
	     if(n>0) {
	    	 System.out.println("Record Deleted Successfully");
	     }
	     else {
	    	 System.out.println("Failed to add your data");
	     }
	   	     
	   }
   
   public void ViewAllFacultyRecords()
   {
	   List<Faculty> facultylist =dao.ViewAllFaculty();
	   int count = facultylist.size();
	   System.out.println("All Records Available are:"+count);
	   
	   if(count>0) {
		   for(Faculty faculty:facultylist) {
		   System.out.println(faculty.toString());
	   }
	   }
	   else {
		   System.out.println("NO STORED DATA");
	   }
	 
	  
	  
   }
   public void ViewFacultyRecordById()
   {
     Faculty f=dao.ViewFacultyByID(2000032093);
     System.out.println(f.toString());
   }
   
}