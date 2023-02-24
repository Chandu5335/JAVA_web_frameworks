package InterfaceDI;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.tools.javac.code.Attribute.Array;

@Configuration
public class AppConfig{
	

	@Bean(name="employeebean")

	public Employee getEmployeeData() {
		Employee emp = new Employee();
		emp.setId(2000032093);
		emp.setName("CHANDU");
		emp.setsalary(150000);
		emp.setSkills(Arrays.asList("AWS","ORACLE","RPA"));
		
		return emp;
	}
	
}