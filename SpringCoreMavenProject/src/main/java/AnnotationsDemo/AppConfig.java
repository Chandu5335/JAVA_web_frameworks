package AnnotationsDemo;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ConstructorDI.Employee;
@Configuration
public class AppConfig {
@Bean(name="customerbean")
public Customer getCustomerData() {
  Customer c = new Customer();
  c.setId(2000032093);
  c.setName("Rajaan");
  c.setGender("Male");
  c.setAge(20.50);
  return c;
} 
@Bean(name="emplbean")
public Employoi getEmployeeData() {
  Employoi emp = new Employoi(2000032093, 230000.50, "CHANDU",(List<String>) Arrays.asList("SEACLUB","TeamFocus","TeamKognitiv"));
  return emp;
}
}