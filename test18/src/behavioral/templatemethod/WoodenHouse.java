package behavioral.templatemethod;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("나무벽 만듭니다.");
	}

	@Override
	public void buildPillars() {
		System.out.println("나무기둥 만듭니다.");
	}

}
