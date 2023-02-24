package AutowiringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController {
	
	public static void main(String[] args) {
		
		 //Spring IoC Container with BeanFactory
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Faculty f = (Faculty)applicationContext.getBean("facultybean");
		System.out.println(f.toString());
	}

}
