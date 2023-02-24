package InterfaceDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientContoller {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Interface Dependency Injection");
		
		Employee emp = (Employee) context.getBean("employeebean");
		emp.display();
	}
}
