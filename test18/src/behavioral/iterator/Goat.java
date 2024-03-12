package behavioral.iterator;

public class Goat implements Animal{

	@Override
	public void eat() {
		System.out.println("주로 먹는 풀은 뜯어 먹습니다.");
	}
	@Override
	public void sleep() {
		System.out.println("엎드려서 잡니다.");	
	}
	@Override
	public void soud() {
		System.out.println("음메헤에");
	}
 
	
}
