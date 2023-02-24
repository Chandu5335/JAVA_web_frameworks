package InterfaceDI;

import java.util.List;

public interface EmployeeService {
	public void setId(int id);
	public void setName(String name);
	public void setsalary(double salary);
	public void setSkills(List<String> skills);
	public void display();

}
