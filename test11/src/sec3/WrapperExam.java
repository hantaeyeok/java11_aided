package sec3;

public class WrapperExam {

	public static void main(String[] args) {
//		int a;		//기본타입 선언
//		System.out.println("a"+a);		//값을 초기화하지않으면 메모리에 담기지 않는다.
//		Integer a;
//		System.out.println("a"+a);		//값을 초기화하지않으면 메모리에 담기지 않는다.
		int a = 10;
		Integer b = a;					//참조형 타입 선언(참조형에 기본형 데이터 대입 : wrapping, Boxing)
		int c = b;						//기본형에 참조형 데이터 대입 : UnWrapping, UnBoxing)
		//Boxing 이유 : 기본형은 맴버를 가질 수 없으므로 해당 타입의 메소드나 필드가 없기 때문에 
		//참조형으로 변경하여야 여러 필요한 정보를 확인하고, 그 타입의 메소드를 사용할 수 있어야 하므로
		//해당 타입의 관련 메소드를 사용하기 위해서는 기본형을 참조형으로 바꾸어야 한다.
		//그러므로, 기본 타입에 관련된 Boxing or Wrapping 을 실시하여 참조형으로 변경할 수 있는 
		//클래스를 Wrapper 클래스라고 한다.
		//boolean <=> Boolean		: Boxing
		//byte	  <=> Byte			: Boxing
		//char    <=> Character		: Boxing
		//short   <=> Short			: Boxing
		//int 	  <=> Integer		: Boxing
		//long	  <=> Long			: Boxing
		//float   <=> Float			: Boxing
		//double  <=> Double		: Boxing
		
		
		//System.out.println("a = > "+b instanceof  Integer);		//instanceof  는 wrapper 타입이 아닌 경우 사용한다.
		String d ="10";
		String e = "3.14";
//		double f = (double) e;
		System.out.println("문자열 10을 Byte(절대값) 타입의 10으로 변경 = > "+Byte.valueOf("10"));
		System.out.println("문자열 10을 Integer(정수) 타입의 10으로 변경 = > "+Integer.valueOf("10"));
		System.out.println("문자열 3.14을 Double(실수) 타입의 10으로 변경 = > "+Double.valueOf(e));
		

	}

}
