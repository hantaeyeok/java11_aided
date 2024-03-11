package creational.singleton;
//Singleton : 객체를 하나만 만들때 사용
public class Singleton {
	private static Singleton instance;		//static 맴버 필드는 공유 메모리
	private int msg;
	private Singleton(int msg) {
		this.msg =msg;
	}
	public static Singleton getInstance(int msg) {	
		//static 메소드는 객체 생성 없이 Singleton의 인스턴스명 = Singleton.getInstance(정수)
		if(instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}
	public void print() {
		System.out.println(msg);
	}
	
}
