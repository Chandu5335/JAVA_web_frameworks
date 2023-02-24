package com.klef.jfsd;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CustomerCRUDOperations 
{
   
   public void insertCustomer()
   {
	   Configuration configuration=new Configuration();
	   configuration.configure("hibernate.cfg.xml");
	   
	   SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	   
	   Transaction transaction=session.beginTransaction();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Your Details Here");
	   Customer customer=new Customer();
	   System.out.println("Enter Id");
	   customer.setId(sc.nextInt());
	   System.out.println("Enter Name");
	   customer.setName(sc.next());
	   System.out.println("Enter Gender");
	   customer.setGender(sc.next());
	   System.out.println("Enter Username");
	   customer.setUsername(sc.next());
	   System.out.println("Enter Password");
	   customer.setPassword(sc.next());
	   System.out.println("Enter Age");
	   customer.setAge(sc.nextDouble());
	   System.out.println("Enter Salary");
	   customer.setSalary(sc.nextDouble());
	   System.out.println("Enter Location");
	   customer.setLocation(sc.next());
	   customer.setMarriedstatus(false);

	   session.save(customer);
	   transaction.commit();
	   System.out.println("Customer Object Saved Successfully");
	   
	   session.close();
	   sessionFactory.close();
	   
   }
   public void deleteCustomer()
   {
	   Configuration configuration=new Configuration();
	   configuration.configure("hibernate.cfg.xml");
	   
	   SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	   
	   Transaction transaction=session.beginTransaction();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter id YOU need to delete");
	   
	   Object obj=session.get(Customer.class, sc.nextInt());
	   Customer customer=(Customer)obj;
	   if(customer!=null)
	   {
		   session.delete(customer); 
		   transaction.commit();
		   System.out.println("Customer Object Deleted Successfully");
	   }
	   else
	   {
		   System.out.println("Customer Object Not Found");
	   }
	   
	   
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
		List<Customer> customerlist  = qry.getResultList();
		System.out.println("*** USING COMPLETE OBJECT ***");
		System.out.println("Total Records:"+customerlist.size());
		for(Customer customer : customerlist)
		{
			System.out.println(customer.toString());
		}
		
		
		
	   /*
	   System.out.println("Enter Id you need to view");
	   Scanner sc = new Scanner(System.in);
	   Object obj=session.get(Customer.class, sc.nextInt());
	   Customer customer=(Customer)obj;
	  
	   if(customer!=null)
	   {
		   System.out.println(customer.getId());
		   System.out.println(customer.getName());
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
	   */
	   
   }
   public void updateCustomer()
   {
	   Configuration configuration=new Configuration();
	   configuration.configure("hibernate.cfg.xml");
	   
	   SessionFactory sessionFactory=configuration.buildSessionFactory();
	   Session session=sessionFactory.openSession();
	   
	   Transaction transaction=session.beginTransaction();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Id you want to UPDATE");
	   Object obj=session.get(Customer.class, sc.nextInt());
	   Customer customer=(Customer)obj;
	   if(customer!=null) 
	   {
		   int temp=0;
		   
		   
		   System.out.println("Do you want to change Name? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
			   customer.setName(sc.next());
			   temp=0;
		   }
		   
		   System.out.println("Do you want to change username? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
			   customer.setGender(sc.next());
			   temp=0;
		   }
		   System.out.println("Do you want to change username? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
		   customer.setUsername(sc.next());
		   temp=0;
		   }
		   System.out.println("Do you want to change Password? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
			   customer.setPassword(sc.next());
			   temp=0;
		   }
		   System.out.println("Do you want to change Age? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
			   customer.setAge(sc.nextDouble());
			   temp = 0;
		   }
		   System.out.println("Do you want to change Salary? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
		   customer.setSalary(sc.nextDouble());
		   temp=0;
		   }
		   System.out.println("Do you want to change Location? 1.Yes 2.No");
		   temp =sc.nextInt();
		   if(temp ==1) {
		   customer.setLocation(sc.next());
		   temp=0;
		   }
		   customer.setMarriedstatus(true);
		   
		   transaction.commit();
		   System.out.println("Customer Object Updated Successfully");
		   
	   }
	   else
	   {
		   System.out.println("Customer Object Not Found");
	   }
	   session.close();
	   sessionFactory.close();
   }
   
   
   public static void main(String args[])
   {
	   
	   CustomerCRUDOperations crudOperations=new CustomerCRUDOperations();
	
	
	int x;
	Scanner sc = new Scanner(System.in);
		
	//CustomerCRUDOperations crudOperations=new CustomerCRUDOperations();
	int ch=1;
	do{
		

		System.out.println("*****************************************************************");
		System.out.println("You want to do \n 1.insert \n 2.view \n 3.delete \n 4.update");
		System.out.println("*****************************************************************");

		x=sc.nextInt();
		switch(x) {
	
	case 1:
		crudOperations.insertCustomer();
		break;
		
	case 2:
		crudOperations.viewAllCustomersDetails();
		break;
	case 3:
		crudOperations.deleteCustomer();
		break;
	case 4:
		crudOperations.updateCustomer();
		break;
	default :
		ch =0;
		}
		
	}while(ch==1);
	
	
	
	}
	
}
	
	
	
	


