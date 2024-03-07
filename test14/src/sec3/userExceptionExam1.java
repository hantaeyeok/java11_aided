package sec3;

class RunException extends Exception{
	//생성자 생성
	public RunException() {}
	public RunException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("사용자 정의 예외 발생");
	}
	
}

public class userExceptionExam1 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void method1() throws RunException {
		throw new RunException("사용자 예외");
	}

}
