package creational.abstractFactroy;

public abstract class Item {	//Link, Page, Tray의 Super 클래스
	protected String caption;	//내용
	public Item(String caption) {	//생성자
		this.caption = caption;
	}
	public abstract String makeHTML();	//추상메소드
	
	
}
