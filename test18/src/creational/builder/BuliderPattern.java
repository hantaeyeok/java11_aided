package creational.builder;
//Builder Pattern : 맴버 필드와 같은 구성원을 하나 하나 샇아 올려 객체를 생성하는 패턴
class Student{
	private int no;
	private String name = "홍길동";
	private int point= 0;
	private String phoneNumber = "010-0000-0000";
	public Student(int no, String name, int point, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
}

class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	public StudentBuilder name(String name) {
		this.name=name;
		return this;
	}
	public StudentBuilder point(int point) {
		this.point=point;
		return this;
	}
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {//이부분이 중요함
		return new Student(no,name,point,phoneNumber);
	}
	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
}


public class BuliderPattern {
	public static void main(String[] args) {
		//StudentBuilder를 이용한 Student 객체 생성-해당 맴버를 하나 씩 메소드체이닝 방법에 의해 추가하는 객체 생성 방식
		Student student = new StudentBuilder()
				.no(1001)
				.name("한태역")
				.point(80)
				.phoneNumber("010-0000-1234")
				.build();
		//StudentBuilder를 이용한 Student 객체 생성, 원하는 값만 입력 가능
		Student student2 = new StudentBuilder()
				.no(1002)
				.build();
		Student student3 = new StudentBuilder()
				.no(1003)
				.name("gksxodur")
				.build();
		System.out.println(student.toString());
		System.out.println(student2.toString());	
		System.out.println(student3.toString());
		
		//생성자에 의한 Student 객체 생성
		Student student5 = new Student(1005,"hty",80,"010-1234-1234");
		System.out.println(student5.toString());
		
	}

}
