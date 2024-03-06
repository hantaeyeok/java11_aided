package sec1;

interface Matrial{
	void doPrinting();
	
}

class Powder implements Matrial{
	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
		
	}
	public String toString() {
		return "Powder";
	}
}

class Plastic implements Matrial{
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
		
	}
	public String toString() {
		return "Plastic";
	}
	
}

class GenricPrint<T extends Matrial>{// Matrial 인터페이스의 자식(후손) 클래스만 허용
	private T matrial;

	public GenricPrint() {}
	public GenricPrint(T matrial) {
		super();
		this.matrial = matrial;
	}
	public T getMatrial() {
		return matrial;
	}
	public void setMatrial(T matrial) {
		this.matrial = matrial;
	}
	
	
}
//T extends Matrial => 제네릭의 한정자 
public class GenericExam3 {
	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		GenricPrint<Plastic> g1 = new GenricPrint<>();			//Plastic이 Matrial의 자식 클래스 가능
		
		Powder p2 = new Powder();
		GenricPrint<Powder> g2 = new GenricPrint<>();
//		GenricPrint<Student> g3 = new GenricPrint<>();			//Student 클래스는 Matrial 인터페이스의 자식 클래스에 해당하지 않으므로 오류 발생

		
	}

}
