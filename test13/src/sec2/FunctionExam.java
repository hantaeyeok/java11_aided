package sec2;
//함수(메소드) 정의와 사용 방법
//메소드 기술
class Met1{
	void method1() {				//매개변수 x , 반환 x
		int x = 100, y = 200;
		System.out.println(x+y);
	}
}	
class Met2{							//매개변수 o , 반환 x
	void method2(int x, int y) {
		System.out.println(x+y);
	}
}
class Met3{							//매개변수 x, 반환 o
	int method3() {
		int x = 100,y=200;
		return x+y;
	}
}
class Met4{							//매개변수 x, 반환 o
	int method4(int x, int y) {
		return x+y;
	}
}

public class FunctionExam {

	public static void main(String[] args) {
		//메서드(Method) : , 특정 클래스에 맴버로 규정되어 있어 객체를 생성을하고, 해당 객체.메소드명(값,..)  로 호출하여 사용
		//
		System.out.println("\nMethod");
		Met1 met1 = new Met1();
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100, 200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100, 200));
	
		System.out.println("\nFunction");
		//함수는 하나의 클래스에서 재활용은 가능하지만 다른 클래스에서는 재활용이 불가능하다.
		fnc1();
		fnc2(100, 200);
		System.out.println(fnc3());
		System.out.println(fnc4(100, 200));
	}
	
	public static void fnc1() {					//매개변수 x , 반환 x
		int x = 100, y =200;
		System.out.println(x+y);
	}
	
	public static void fnc2(int x,int y) {		//매개변수 o , 반환 x
		System.out.println(x+y);
	}
	public static int fnc3() {					//매개변수 x, 반환 o
		int x = 100, y=200;
		return x+y;
	}
	public static int fnc4(int x,int y) {		//매개변수 x, 반환 o
		return x+y;
	}
	
	
}
