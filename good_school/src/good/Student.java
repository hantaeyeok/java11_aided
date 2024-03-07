package good;

public class Student {
	private int no;		//학번
	private String name;	//이름
	private String essense;		//필수과목
	private Subject subject;
	//
	public Student() {}
	public Student(int no, String name, String essense, String subject) {
		super();
		this.no = no;
		this.name = name;
		this.essense = essense;
		this.subject = subject;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEssense() {
		return essense;
	}
	public void setEssense(String essense) {
		this.essense = essense;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", essense=" + essense + ", subject=" + subject + "]";
	}
	
	
}
