
package com.klef.jfsd;

import java.util.List;
import java.util.Scanner;

//import org.hibernate.Query;
//import org.hibernate.Criteria;

//import javax.persistence.Query;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.cfg.Configuration;

public class HQLDemo {
	Scanner sc = new Scanner(System.in);
	public void viewallCustomer()       //complete entity or object
	{
		   Configuration configuration=new Configuration();
		   configuration.configure("hibernate.cfg.xml");
		   
		   SessionFactory sessionFactory=configuration.buildSessionFactory();
		   Session session=sessionFactory.openSession();
		   Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Your Query");
	    Query qry = session.createQuery(sc.nextLine());
		List<Customer> customerlist  = qry.getResultList();
		System.out.println("*** USING COMPLETE OBJECT ***");
		System.out.println("Total Records:"+customerlist.size());
		for(Customer customer : customerlist)
		{
			System.out.println(customer.toString());
		}
		session.close();
		sessionFactory.close();
	}
		public void viewallCustomerpartially() // partial entity or object
		{
			 Configuration configuration=new Configuration();
			   configuration.configure("hibernate.cfg.xml");
			   
			   SessionFactory sessionFactory=configuration.buildSessionFactory();
			   Session session=sessionFactory.openSession();
			  System.out.println("Enter Your Query");
			   Query qry = session.createQuery(sc.nextLine());
			     List<Object[]> customerlist=qry.getResultList();
			     System.out.println("***Using Partial Object***");
			     System.out.println("Total Records="+customerlist.size());
			     for(Object[] obj:customerlist)
			     {
			       System.out.println("Customer ID="+obj[0]);
			       System.out.println("Customer Name="+obj[1]);
			       System.out.println("Customer Salary="+obj[2]);
			       System.out.println("Customer Username="+obj[3]);
			       System.out.println("Customer Location="+obj[4]);
			       System.out.println();
			     }
			     session.close();
			     sessionFactory.close();
			   
		}
		
		public void AggregateFunctions() {
			Configuration configuration=new Configuration();
		     configuration.configure("hibernate.cfg.xml");
		     
		     SessionFactory sessionFactory=configuration.buildSessionFactory();
		     Session session=sessionFactory.openSession();
		     /**/
		     int temp=0;
		     
		     System.out.println("Doy you need to find total records 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		    	 
		     Query q1 = session.createQuery("select count(*) from Customer");
		     List list1 = q1.list();
		     System.out.println("####count(*)#####");
		     System.out.println("Total Records count:"+list1.get(0));
		      
		     temp=0;
		     }
		     System.out.println("Doy you need to find total salaray distributed 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		     
		     Query q2 = session.createQuery("select sum(salary) from Customer");
		     List list2 = q2.list();
		     System.out.println("####SALARY SUM#####");
		     System.out.println("Salary Distribution:"+list2.get(0));
		     temp=0;
		     }
		     
		     System.out.println("Doy you need to find minimum age in record 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		     
		     Query q3 = session.createQuery("select min(age) from Customer");
		     List list3 = q3.list();
		     System.out.println("####MINIMUM AGE#####");
		     System.out.println("Minimum Age:"+list3.get(0));
		     temp=0;
		     }
		     
		     System.out.println("Doy you need to find maximum age in record 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		     Query q4 = session.createQuery("select max(age) from Customer");
		     List list4 = q4.list();
		     System.out.println("####MAXIMUM AGE#####");
		     System.out.println("Maximum Age:"+list4.get(0));
		     temp=0;
		     }
		     
		     System.out.println("Doy you need to find average of salary in record 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		     
		     Query q5 = session.createQuery("select avg(salary) from Customer");
		     List list5 = q5.getResultList();
		     System.out.println("####AVERAGE SALARY#####");
		     System.out.println("Average Salary:"+list5.get(0));
		     
		     temp=0;
		     }
		     
		     session.close();
		     sessionFactory.close();
		     
		}
		
		
		
		public void updatedeletepositionalParameters() {
			
			Configuration configuration=new Configuration();
		     configuration.configure("hibernate.cfg.xml");
		     
		     SessionFactory sessionFactory=configuration.buildSessionFactory();
		     Session session=sessionFactory.openSession();
		     
		     Transaction transaction=session.beginTransaction();
		     
		     int temp=0;
		     System.out.println("Doy you need to update records 1.Yes\n 2.No");
		     temp=sc.nextInt();
		     if(temp==1) {
		     System.out.println("Ente query");
		     Query q1= session.createQuery("update Customer set name=?1,salary=?2 where id=?3");
		     q1.setString(1,"SRINIVAS");
		     q1.setDouble(2,5000000.50);
		     q1.setInteger(3,101);
		   
		     
		     int count = q1.executeUpdate();
		     System.out.println(count+" RECORDS UPDATED");
		     temp=0;
		     }
		     Query q2= session.createQuery("delete from Customer where id=?1");
		     q2.setInteger(1,110);
		     
		     int count1 = q2.executeUpdate();
		     System.out.println(count1+" RECORDS DELETED");
		     
		     transaction.commit();
		     session.close();
		     sessionFactory.close();
		     
			
		}
		
		public void updatedeletenamedparameters()
		   {
		     Configuration configuration=new Configuration();
		       configuration.configure("hibernate.cfg.xml");
		       
		       SessionFactory sessionFactory=configuration.buildSessionFactory();
		       Session session=sessionFactory.openSession();
		       
		       Transaction transaction=session.beginTransaction();
		       
		       Query q1 = session.createQuery("Update Customer set name=:v1,salary=:v2 where id=:v3");
		       q1.setParameter("v1","KING");
		       q1.setParameter("v2",150000.00);
		       q1.setParameter("v3",101);
		       
		       int count = q1.executeUpdate();
		       System.out.println(count+" Record(s) UPDATED");
		       
		       
		       Query q2 = session.createQuery("delete from Customer where id=:v1");
		       q2.setParameter("v1",108);
		       int count1 = q2.executeUpdate();
		       System.out.println(count1+" Record(s) DELETED");
		       
		       
		       
		       transaction.commit();
		       session.close();
		       sessionFactory.close();
		   }
		
		public void selectpostionalparameters()
		   {
		     Configuration configuration=new Configuration();
		     configuration.configure("hibernate.cfg.xml");
		     
		     SessionFactory sessionFactory=configuration.buildSessionFactory();
		     Session session=sessionFactory.openSession();
		     
		     Query qry = session.createQuery("from Customer where id=?1");
		     qry.setInteger(1, 103);
		     List<Customer> customerlist = qry.getResultList();
		     System.out.println("TotalRecords : "+customerlist.size());
		     for(Customer c:customerlist) {
		    	 System.out.println(c.toString());
		    	 
		     }
		    
		     Query qry1 = session.createQuery("from Customer where username=?1 and password=?2");
		     qry1.setString(1,"klu123");
		     qry1.setString(2,"klu");
		     List<Customer> customerlist1 = qry1.getResultList();
		     
		     if(customerlist1.size()==1) {
		    	 System.out.println("CUSTOMER FOUND");
		    	 System.out.println("customerlist1.get(0)");
		     }
		     else {
		    	 System.out.println("CUSTOMER NOT FOUND");
		     }
		     
		     session.close();
		     sessionFactory.close();
		   } 
		   
		public void selectnamedparameters()
		   {

		     Configuration configuration=new Configuration();
		     configuration.configure("hibernate.cfg.xml");
		     
		     SessionFactory sessionFactory=configuration.buildSessionFactory();
		     Session session=sessionFactory.openSession();
		     
		     Query qry1 = session.createQuery("from Customer where id=:v");
		     qry1.setParameter("v", 101);
		     List<Customer> customerlist = qry1.getResultList();
		     System.out.println("Total Records="+customerlist.size());
		     for(Customer c : customerlist)
		     {
		       System.out.println(c.toString());
		     }
		    
		     Query qry2 = session.createQuery("from Customer where username=:v1 and password=:v2");
		     qry2.setParameter("v1","mech");
		     qry2.setParameter("v2", "mech3339");
		     
		     List<Customer> customerlist2 = qry2.getResultList();
		     if(customerlist2.size()==1)
		     {
		       System.out.println("Customer Record Found");
		       System.out.println(customerlist2.get(0));
		     }
		     else
		     {
		       System.out.println("Customer Record Not Found");
		     }
		     
		    
		     
		     session.close();
		     sessionFactory.close();
		   }
		
		public static void main(String[] args) {
			HQLDemo demo= new HQLDemo();
			//demo.viewallCustomer();
			//demo.viewallCustomerpartially();
			//demo.AggregateFunctions();
			//demo.updatedeletepositionalParameters();
			//demo.updatedeletenamedparameters();
			//demo.selectpostionalparameters();
			//demo.selectnamedparameters();
			
			
			int x;
			Scanner sc = new Scanner(System.in);
				
			//CustomerCRUDOperations crudOperations=new CustomerCRUDOperations();
			int ch=1;
			do{
				

				System.out.println("*****************************************************************");
				System.out.println("You want to do \n 1.viewallCustomer \n 2.viewallCustomerpartially \n 3.AggregateFunctions \n 4.updatedeletepositionalParameters \n 5.updatedeletenamedparameters \n 6.selectpostionalparameters \n 7.selectnamedparameters");
				System.out.println("*****************************************************************");

				x=sc.nextInt();
				switch(x) {
			
			case 1:
				demo.viewallCustomer();
				break;
				
			case 2:
				demo.viewallCustomerpartially();
				break;
			case 3:
				demo.AggregateFunctions();
				break;
			case 4:
				demo.updatedeletepositionalParameters();
				break;
				
			case 5:
				demo.updatedeletenamedparameters();
				break;
				
			case 6:
				demo.selectpostionalparameters();
				break;
				
			case 7:
				demo.selectnamedparameters();
				break;
				
			default :
				ch =0;
				}
				
			}while(ch==1);
			sc.close();
			
		}
		
		
		
		   
	}


