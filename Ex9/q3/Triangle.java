public class Triangle extends Shape {
	private int base, height;
	public Triangle(int base, int height,
			int x, int y) {
		this.base = base;
		this.height = height;
		super.setxPos(x);
		super.setyPos(y);
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	//accept the visit by calling the visit method of the visitor
	//passing self as an argument
	//i.e. please do whatever you have to do when visiting me. 
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
