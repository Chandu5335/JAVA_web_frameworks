package ConstructorDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientController 
{
  public static void main(String[] args) 
  {  
    //Spring IoC Container with BeanFactory
     
     Resource resource= new ClassPathResource("applicationContext.xml");
     BeanFactory beanFactory = new XmlBeanFactory(resource);
     
     Employee employee = (Employee)beanFactory.getBean("empbean");
     System.out.println(employee.toString());
     
     //to display only student id
    //. System.out.println("ID="+employee.getId());
     
     
     
   //Spring IoC Container with ApplicationContext
     ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
     
     Employee e = (Employee)applicationContext.getBean("empbean"); 
     
     // to display only Employee name
     System.out.println("Name="+e.toString());

  }

}