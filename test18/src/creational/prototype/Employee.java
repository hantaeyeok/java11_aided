package creational.prototype;

import java.util.ArrayList;
import java.util.List;

//복제 가능한
public class Employee implements Cloneable {
	private List<String> employeeList;

	public Employee() {
		employeeList = new ArrayList<String>();
	}
	public Employee(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void loadData() {
		employeeList.add("김기태");
		employeeList.add("김기태1");
		employeeList.add("김기태2");
		employeeList.add("김기태3");
		employeeList.add("김기태4");
	}
	
	public List<String> getEmployeeList() {
		return employeeList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<String>();
		for(String s : employeeList) {
			tmp.add(s);
		}
		return new Employee(tmp);
	}
	
	@Override
	public String toString() {
		return "Employee [employeeList=" + employeeList + "]";
	}
	
	
}
