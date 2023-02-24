package AnnotationsDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ClientController {
public static void main(String args[]) {
  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
  System.out.println("****Setter Dependency injection****");
  System.out.println("****Bean Annotation without Bean name****");
  Customer c1=context.getBean(Customer.class);
  c1.display();
  
  System.out.println("****Bean Annotation without Bean name****");
  Customer c2=(Customer)context.getBean("customerbean");
  c2.display();
  System.out.println("****Construction Dependency Injection***");
  Employoi emp = (Employoi) context.getBean("emplbean");
  emp.display();
}
}