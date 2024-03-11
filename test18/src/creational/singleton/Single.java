package creational.singleton;
//가장 단순한 singleton
public class Single {
	private static Single instance;			//
	private Single() {}						//
	public static Single getInstance() {
		if(instance == null) {
			instance = new Single();
		}
		return instance;
	}
}
