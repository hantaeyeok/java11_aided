package sec1;
//내부 클래스 : Inner Class : 클래스 내부에 선언한 클래스 
class Outer{							//외부클래스
	private int num = 10;				//맴버필드
	private static int sNum = 20;		//정적 맴버필드-인스턴스끼리 데이터를 공유-
	//
	public Outer() {					//Outer 생성자를 사용하게 되면, 자동적으로 내부 클래스에 대한 인스턴스 생성
		inner = new Inner();
	}
	//
	public Inner inner;	//인스턴스 내부 클래스
	
	class Inner{		//내부 클래스
		int iNum = 1000;
		void inMethod() {				//내부클래스에서 외부클래스를 호출하려면 그냥 사용가능
			System.out.println("내부 클래스에서 외부클래스의 맴버 변수 : num"+num);
			System.out.println("내부 클래스에서 외부클래스의 정적 맴버 변수 : sNum"+sNum);
		}
	}
	//
	public void outMethod() {			//외부 클래스에서 내부 클래스 메소드 호출, 은 인스턴스 inner.으로 사용해야함
		inner.inMethod();
	}
	
}

public class InnerClassExam {
	public static void main(String[] args) {
		//다른 클래스에서 접근하고 호출
		
		Outer out = new Outer();
		out.outMethod(); 				//타 클래스에서 객체 생성 후 외부 클래스의 맴버 메소드 호출
		out.inner.inMethod();			//타 클래스에서 객체 생성 후 내부 클래스의 맴버 메소드 호출
	}

}
