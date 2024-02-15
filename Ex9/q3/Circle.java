public class Circle extends Shape {
	private double radius;
	public Circle(double radius, int x, int y) {
		this.radius = radius;
		super.setxPos(x);
		super.setyPos(y);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	//accept the visit by calling the visit method of the visitor
	//passing self as an argument
	//i.e. please do whatever you have to do when visiting me. 
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
