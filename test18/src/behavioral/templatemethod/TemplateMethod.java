package behavioral.templatemethod;
//Template Method Pattern : 공통 메소드를 상위 클래스에서 정의, 세부 사항은 하위 클래스에서 구현
public class TemplateMethod {
	HouseTemplate house1 = new WoodenHouse();
	house1.buildHouse();		//private final void buildHouse() { final 이라서 안됨
	System.out.prinln();
	
	house1 = new GlassHouse();
	house1.
}
