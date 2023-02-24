package SetterDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientController {
	public static void main(String[] args) {
		
		//Spring IoC Container with BeanFactory
		
		
	   Resource resource= new ClassPathResource("applicationContext.xml");
	   BeanFactory beanFactory = new XmlBeanFactory(resource);
	   
	   Student student = (Student)beanFactory.getBean("studentbean");//here object is created
	   System.out.println(student.toString());
	   
	   //to display only student id
	   System.out.println("ID="+student.getId());
	   System.out.println("Name="+student.getName());
	   
	   
	   
	 //Spring IoC Container with ApplicationContext
	
	   
	   ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	   
	   Student s = (Student) applicationContext.getBean("studentbean"); //here object is created
	   System.out.println(s.toString());
	}

}
