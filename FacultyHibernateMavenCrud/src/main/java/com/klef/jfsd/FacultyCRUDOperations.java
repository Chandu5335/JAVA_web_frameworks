package com.klef.jfsd;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FacultyCRUDOperations 
{
   public static void main(String args[])
   {

public void insertCustomer()
   {
	   Configuration configuration=new Configuration();
	   configuration.configure("hibernate.cfg.xml");
	   
	   SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	   
	   Transaction transaction=session.beginTransaction();
	   
	   Faculty faculty=new Faculty();
	   faculty.setName("Rajaan");
	   faculty.setGender("MALE");
	   faculty.setQualification("ragshsj");
	   faculty.setCollege("mech3339");
	   faculty.setDepartment("cse");
	   faculty.setDesignation("home");
	   faculty.setSalary(305000.00);
	   faculty.setLocation("KHAMMAM");
	   faculty.setContactn0("7075695962");

	   session.save(faculty);
	   transaction.commit();
	   System.out.println("Customer Object Saved Successfully");
	   
	   session.close();
	   sessionFactory.close();
	   
   }
public void viewAllCustomersDetails()
{
	   Configuration configuration=new Configuration();
	   configuration.configure("hibernate.cfg.xml");
	   
	   SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	   
	   
	   Query qry = session.createQuery("from Customer");
		List<Faculty> facultylist  = qry.getResultList();
		System.out.println("*** USING COMPLETE OBJECT ***");
		System.out.println("Total Records:"+facultylist.size());
		for(Faculty customer : facultylist)
		{
			System.out.println(customer.toString());
		}
		
		
		
	   
	   System.out.println("Enter Id you need to view");
	   Scanner sc = new Scanner(System.in);
	   Object obj=session.get(Faculty.class, sc.nextInt());
	  Faculty facultyr=(Faculty)obj;
	  
	   if(faculty!=null)
	   {
		   System.out.println(faculty.getId());
		   System.out.println(faculty.getName());
		   System.out.println(customer.getGender());
		   System.out.println(customer.getUsername());
		   System.out.println(customer.getPassword());
		   System.out.println(customer.getAge());
		   System.out.println(customer.getSalary());
		   System.out.println(customer.getLocation());
		   System.out.println(customer.isMarriedstatus());
	   }
	   else
	   {
		   System.out.println("Customer Object Not Found");
	   }
	   session.close();
	   sessionFactory.close();
	   
	   
}

}