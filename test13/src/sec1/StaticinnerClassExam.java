package sec1;

import sec1.Outer2.Inner;

//정적 내부 클래스인 Inner 클래스는 외부든 내부든 정적요소만 허용

class Outer2 {		//디폴트 값이 같은 패키지안에선  같기 때문에 Outer2로 선언	//외부 클래스
	private int num = 10;
	private static int sNum =20;

/*	public Inner inner;
	public Outer2() {
		inner = new Inner();
	}
*/	
	//내부클래스
	static class Inner {					//정적 내부 클래수
		int inNum = 1000;
		static int sInNum =2000;
		//내부클래스의 정적 메소드
		void inMethod() {
			System.out.println("내부에서 내부 클래스의 인스턴스 변수 : inNum"+inNum);
			System.out.println("내부에서 내부 클래스의 정적 맴버 변수 : sInNum"+sInNum);
//			System.out.println("내부에서 외부 클래스의 인스턴스 변수 : num"+num);		//공유하는 데이터가 아니기 때문에 불가
			System.out.println("내부에서 외부 클래스의 정적 맴버 변수 : sNum"+sNum);	//가능
			
		}
	}
	//외부클래스의 적적 메소드
	static void outMethod() {
//		System.out.println("외부에서 내부 클래스의 인스턴스 변수 : inNum"+inNum);	//불가
//		System.out.println("외부에서 내부 클래스의 인스턴스 변수 : inNum"+Inner.inNum);	//불가
		System.out.println("외부에서 내부 클래스의 정적 맴버 변수 : sInNum"+Inner.sInNum);	//클래스를 호출하면 가능
//		System.out.println("외부에서 외부 클래스의 인스턴스 변수 : num"+num);		//공유하는 데이터가 아니기 때문에 불가
		System.out.println("외부에서 외부 클래스의 정적 맴버 변수 : sNum"+sNum);	//가능
		
	}

}

public class StaticinnerClassExam {

	public static void main(String[] args) {
//		Outer2.Inner inner new out.Inner();			//불가
//		out.Inner inner2;							//불가
		Outer2 out = new Outer2();					//외부 클래스의 인스턴스
//		out.outMethod();							//outMethod 는 정적메소드 이므로 객체를 생성하지 않고, 실행
		Outer2.outMethod();							
//		Outer2.Inner.inMethod();					//inMethod() : 인스턴스 메소드 이므로 정적 클래스인 Inner를 사용하지못함
//		out.Inner.inMethod();						//Inner가 정적 클래스 이므로 out 인스턴스를 생성하지 않고 Outer2를 활용해야 한다.
		Outer2.Inner inner = new Outer2.Inner();	//내부클래스의 인스턴스
		inner.inMethod();
		//외부 클래스에서는 외부 메소드는 모두 실행 가능, 내부 메소드 및 맴버 변수의 접근 및 실행이 불가능
		//정적 내부 클래스로 생성된 인스턴스는 내부 메소드 및 맴버 변수의 접근 및 실행이 가능
	}

}
