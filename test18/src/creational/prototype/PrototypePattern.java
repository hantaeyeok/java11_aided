package creational.prototype;

import java.util.List;

//Prototype(원형) Pattern : prototype을 복제해서 사용하는 것
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee();	//Employee 원본(prototype)
		emp1.loadData();
		
		Employee emp2 = (Employee) emp1.clone();	//prototype으로 얻어진 복제품
		List<String> list = emp2.getEmployeeList();
		
		list.add("김민식");
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}
}
