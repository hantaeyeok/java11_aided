package behavioral.templatemethod;
//House : 집을 찾는 공통 메소드를 정의하되, 재료가 정해지지 않은 것들은 추상메소드로 정의
public abstract class HouseTemplate {
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}
	
	private void buildWindows() {
		System.out.println("유리 창문 만들기");
	}
	public abstract void buildWalls();		//추상체 구현내요을 미리 정하지 못할 때 추상메소드 아직 벽체를 어떠한 재료로 할지 모르기때문에 추상메서드로 사용
	public abstract void buildPillars();	//추상 메서드는 선언ㅁ낭 ㅣㅆ고 구현이 없다.
	
	private void buildFoundation() {
		System.out.println("벽체/기둥 등의 재료에 맞는 마감재를 선택하였습니다.");
	}
	
}
