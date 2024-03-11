package structural.bridge;

public abstract class Shape {
	protected Color color;		//Composite : 
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
	
}
